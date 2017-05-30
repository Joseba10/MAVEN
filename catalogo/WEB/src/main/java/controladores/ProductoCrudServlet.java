package controladores;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ipartek.TIPOS.Producto;
import com.ipartek.catalogo.DAL.ProductoDAL;

@WebServlet("/admin/productocrud")
public class ProductoCrudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String RUTA_LISTADO = "/WEB-INF/vistas/productocrud.jsp";
	static final String RUTA_FORMULARIO = "/WEB-INF/vistas/productoform.jsp";
	static final String RUTA_SERVLET_LISTADO = "/admin/productocrud";
	// LOG4J
	private static Logger log = Logger.getLogger(ProductoCrudServlet.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext application = request.getServletContext();
		ProductoDAL dal = (ProductoDAL) application.getAttribute("productosDal");// Si
																					// entras
																					// por
		// primera vez se
		// crea un objeto
		// dal lo guarda y
		// siempre coge el
		// mismo si entras
		// de nuevo

		String op = request.getParameter("op");

		if (op == null) {

			// Producto[] listaproductos = (Producto[])
			// application.getAttribute("listaproductos");
			//
			// application.setAttribute("listaproductos", listaproductos);

			request.getRequestDispatcher(RUTA_LISTADO).forward(request, response);
		} else {

			Producto producto;
			Integer id;
			switch (op) {
			case "modificar":
			case "borrar":

				id = Integer.parseInt(request.getParameter("id"));

				producto = dal.buscarPorId(id);

				request.setAttribute("producto", producto);
				// request.getRequestDispatcher(RUTA_FORMULARIO).forward(request,
				// response);

			case "alta":
				log.info("Se ha dado un nuevo producto de alta");

				for (Producto p : dal.buscarTodosLosProductos()) {

					log.info(p);
				}

				request.getRequestDispatcher(RUTA_FORMULARIO).forward(request, response);

				break;
			default:
				request.getRequestDispatcher(RUTA_LISTADO).forward(request, response);
			}
		}
	}
}
