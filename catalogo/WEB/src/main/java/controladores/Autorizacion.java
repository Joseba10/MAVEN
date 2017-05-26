package controladores;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ipartek.TIPOS.Usuario;

public class Autorizacion implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession();

		Usuario usuario = null;

		if (session != null) {
			usuario = (Usuario) session.getAttribute("usuario");
		}

		boolean nuevoUsuario = usuario == null;
		boolean esAdmin = false;

		if (!nuevoUsuario) {

			esAdmin = usuario.isAdmin();
		}
		RequestDispatcher productocrud = req.getRequestDispatcher("/admin/productocrud");
		if (!esAdmin) {

			(req.getRequestDispatcher("/loginserver")).forward(request, response);
		}

		else {

			(productocrud).forward(request, response);
			chain.doFilter(request, response);

		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
