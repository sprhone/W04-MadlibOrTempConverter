package controller;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 18, 2021
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TemperatureConverter;

/**
 * Servlet implementation class convertTempServlet
 */
@WebServlet("/convertTempServlet")
public class convertTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public convertTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String celsius = request.getParameter("celsius");
		String fahrenheit = request.getParameter("fahrenheit");
		
		TemperatureConverter whichConverter;
		
		if (celsius.equals("")) {
			TemperatureConverter fahrenheitConverter = new TemperatureConverter(0, Double.parseDouble(fahrenheit));
			whichConverter = fahrenheitConverter;
		} else {
			TemperatureConverter celsiusConverter = new TemperatureConverter(Double.parseDouble(celsius));
			whichConverter = celsiusConverter;
		}
		
		request.setAttribute("convertedTemps", whichConverter);
		
		getServletContext().getRequestDispatcher("/tempResults.jsp").forward(request, response);
	}

}
