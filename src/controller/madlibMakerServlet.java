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

import model.MadlibMaker;

/**
 * Servlet implementation class madlibMakerServlet
 */
@WebServlet("/madlibMakerServlet")
public class madlibMakerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public madlibMakerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name1 = request.getParameter("name1");
		String name2 = request.getParameter("name2");
		String place = request.getParameter("place");
		String object1 = request.getParameter("object1");
		String object2 = request.getParameter("object2");
		String ptverb = request.getParameter("ptverb");
		String imaginaryCreature = request.getParameter("imaginaryCreature");
		
		MadlibMaker newMadlib = new MadlibMaker(name1, name2, place, object1, object2, ptverb, imaginaryCreature);
		
		request.setAttribute("madeMadlib", newMadlib);
		
		getServletContext().getRequestDispatcher("/madlibResults.jsp").forward(request, response);
	}	
}
