package controladores;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.TIPOS.Usuario;
import com.ipartek.catalogo.DAL.DalFactory;
import com.ipartek.catalogo.DAL.UsuariosDAL;

@WebServlet("/loginserver")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/* Package */static final String RUTA = "/WEB-INF/vistas/";
	private static final String RUTA_PRINCIPAL = RUTA + "productocrudusuario.jsp";

	private static final String RUTA_LOGIN = RUTA + "login.jsp";
	public static final int TIEMPO_INACTIVIDAD = 30 * 60;
	/* Package */static final int MINIMO_DE_CARACTERES = 4;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Recoger datos de vistas
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		String opcion = request.getParameter("opcion");
		// Crear modelos en base a los datos
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPass(pass);

		// Llamada a la logica de negocio
		ServletContext application = getServletContext();
		// Recoge datos
		UsuariosDAL usuariosDAL = (UsuariosDAL) application.getAttribute(AltaServlet.USUARIOS_DAL);
		// Si no existe el dato se crea
		if (usuariosDAL == null) {
			usuariosDAL = DalFactory.getUsuariosDAL();
		}

		// Solo para crear una base de datos falsa con el contenido de un
		// usuario
		// "joseba","clemente"

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(TIEMPO_INACTIVIDAD);

		// for (Cookie cookie : request.getCookies()) {
		//
		// if ("JSESSIONID".equals(cookie.getName())) {
		//
		// cookie.setMaxAge(TIEMPO_INACTIVIDAD);
		// response.addCookie(cookie);
		// }
		// }

		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(TIEMPO_INACTIVIDAD);
		response.addCookie(cookie);
		// ESTADOS
		boolean esValido = usuariosDAL.validar(usuario);

		boolean sinParametros = usuario.getNombre() == null;

		boolean esUsuarioRegistrado = request.getSession().getAttribute("usuario") != null;

		boolean quiereSalir = "logout".equals(opcion);

		boolean nombreValido = usuario.getNombre() != null && usuario.getNombre().length() >= MINIMO_DE_CARACTERES;

		boolean passValido = usuario.getPass() != null && usuario.getPass().length() >= MINIMO_DE_CARACTERES;

		// Redirigir a una nueva vista

		if (quiereSalir) {
			session.invalidate();
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		}

		else if (esUsuarioRegistrado) {
			request.getRequestDispatcher(RUTA_PRINCIPAL).forward(request, response);
		} else if (sinParametros) {
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		}

		else if (!nombreValido || !passValido) {

			usuario.setErrores("El nombre y las pass deben tener como minimo " + MINIMO_DE_CARACTERES + " y son ambos requeridos");
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		}

		else if (esValido) {
			session.setAttribute("usuario", usuario);

			// response.sendRedirect("principal.jsp");
			request.getRequestDispatcher(RUTA_PRINCIPAL).forward(request, response);
		}

		else {

			usuario.setErrores("El usuario y contrase�a introducidos no son validos");
			request.setAttribute("usuario", usuario);

			// lleva el contenido de usuario a la pagina login
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		}
	}
}
