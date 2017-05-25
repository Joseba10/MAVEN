package controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.TIPOS.Producto;
import com.ipartek.catalogo.DAL.ProductoDAL;
import com.ipartek.catalogo.DAL.ProductoDALException;

@WebServlet("/productoform")
public class ProductoFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("opform");
		String nombre = request.getParameter("nombre");
		int id;
		String descripcion = request.getParameter("descripcion");
		double precio;
		int imagen;

		if (request.getParameter("imagen") == null) {

			imagen = 0;
		} else if (request.getParameter("imagen") == "") {

			imagen = 0;
		} else {

			imagen = Integer.parseInt(request.getParameter("imagen"));
		}

		if (request.getParameter("id") == null) {

			id = 0;
		} else if (request.getParameter("id") == "") {

			id = 0;
		} else {
			id = Integer.parseInt(request.getParameter("id"));
		}

		if (request.getParameter("precio") == null) {

			precio = 0;
		} else if (request.getParameter("precio") == "") {

			precio = 0;
		} else {

			precio = Double.parseDouble(request.getParameter("precio"));
		}

		RequestDispatcher rutaListado = request.getRequestDispatcher(ProductoCrudServlet.RUTA_SERVLET_LISTADO);
		RequestDispatcher rutaFormulario = request.getRequestDispatcher(ProductoCrudServlet.RUTA_FORMULARIO);

		// response.setContentType("text/plain");
		// PrintWriter out = response.getWriter();
		// out.println(op);
		// out.println(nombre);
		// out.println(pass);
		// out.println(pass2);

		if (op == null) {
			rutaListado.forward(request, response);
			return;
		}

		Producto producto = new Producto(nombre, descripcion, precio, imagen);
		producto.setId(id);
		ServletContext application = request.getServletContext();
		ProductoDAL dal = (ProductoDAL) application.getAttribute("dal");

		switch (op) {
		case "alta":
			if (!dal.validar(producto)) {
				dal.alta(producto);
				rutaListado.forward(request, response);
			} else {
				producto.setErrores("El producto ya existe");
				request.setAttribute("producto", producto);
				rutaFormulario.forward(request, response);
			}

			break;
		case "modificar":

			try {
				dal.modificar(producto);
			} catch (ProductoDALException de) {
				producto.setErrores(de.getMessage());
				request.setAttribute("producto", producto);
				rutaFormulario.forward(request, response);
				return;
			}
			rutaListado.forward(request, response);

			break;
		case "borrar":
			dal.borrar(producto);
			rutaListado.forward(request, response);

			break;

		}
	}
}
