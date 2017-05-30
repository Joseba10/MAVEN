package controladores;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ipartek.TIPOS.Producto;
import com.ipartek.TIPOS.Usuario;
import com.ipartek.catalogo.DAL.ProductoDAL;
import com.ipartek.catalogo.DAL.ProductoDalFactory;
import com.ipartek.catalogo.DAL.UsuariosDAL;
import com.ipartek.catalogo.DAL.UsuariosDalColeccion;

public class Inicializador implements ServletContextListener {

	private static Logger log = Logger.getLogger(Inicializador.class);

	public void contextDestroyed(ServletContextEvent arg0) {

	}

	public void contextInitialized(ServletContextEvent arg0) {

		// Configurar LOG4J

		PropertyConfigurator.configure(Inicializador.class.getClassLoader().getResource("log4j.properties"));

		// Meter cosas de inicio
		UsuariosDAL usuariosDAL = new UsuariosDalColeccion();
		ServletContext application = arg0.getServletContext();
		application.setAttribute("usuariosDal", usuariosDAL);
		usuariosDAL.alta(new Usuario("admin", "admin", true));
		usuariosDAL.alta(new Usuario("usuario1", "pass1"));
		usuariosDAL.alta(new Usuario("usuario2", "pass2"));

		ProductoDAL productosDAL = ProductoDalFactory.getProductoDAL();
		productosDAL.alta(new Producto("Manzana", "Manzana de Asturias", 1.2, 0));
		productosDAL.alta(new Producto("Tomate", "Tomates de Jaen", 2.2, 1));
		application.setAttribute("productosDal", productosDAL);

		Producto[] listaproductos = productosDAL.buscarTodosLosProductos();
		application.setAttribute("listaproductos", listaproductos);
	}

}
