package org.sonatype.mavenbook.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sonatype.mavenbook.weather.Weather;
import org.sonatype.mavenbook.weather.WeatherService;

public class WeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String zip = request.getParameter("zip");
		WeatherService weatherService = new WeatherService();

		Weather weather = null;
		try {
			weather = weatherService.retrieveForecast(zip);
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("weather", weather);
		request.getRequestDispatcher("/WEB-INF/tiempo.jsp").forward(request, response);
	}

}
