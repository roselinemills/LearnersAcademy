package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.LearnerClassDB;
import entity.LearnerClass;

/**
 * Servlet implementation class AddClassServlet
 */
@WebServlet("/AddClassServlet")
public class AddClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String classname = request.getParameter("classname");
		
		String description = request.getParameter("description");
		
		
		if(classname == null || classname.isEmpty())
		{
			response.sendRedirect("addClass.jsp?error=classname cannot empty");
			return;
		}
		if(description == null || description.isEmpty())
		{
			response.sendRedirect("addClass.jsp?error=description cannot empty");
			return;
		}
		LearnerClassDB db = new LearnerClassDB();
		
		LearnerClass lc = new LearnerClass();
		lc.setClass_name(classname);
		lc.setClass_description(description);

		try {
		if(db.AddClassUsingPrepareStatement(lc)) {
				// take me to which page? login page
				response.sendRedirect("LearnerClassServlet");
			}
			else {
				//response.sendRedirect("register.html");
				RequestDispatcher dispatcher = request.getRequestDispatcher("addClass.jsp");
				PrintWriter out = response.getWriter();
				out.println("<p>Unable to add class to master list</p>");
				dispatcher.include(request, response);
			}
		} catch (SQLException e) {
			// keep me on registration page
			response.sendRedirect("addClass.jsp");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
