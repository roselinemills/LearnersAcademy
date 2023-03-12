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

import database.LearnerSubjectDB;
import entity.LearnerSubject;

/**
 * Servlet implementation class AddSubjectServlet
 */
@WebServlet("/AddSubjectServlet")
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String subjectname = request.getParameter("Subjectname");
		
		if(subjectname == null || subjectname.isEmpty())
		{
			response.sendRedirect("addSubject.jsp?error=subject cannot empty");
			return;
		}
	
	LearnerSubjectDB db = new LearnerSubjectDB();

		LearnerSubject s = new LearnerSubject();
		s.setSubject_name(subjectname);
		
			try {
			if(db.AddSubjectUsingPrepareStatement(s)) {
					// take me to which page? login page
					response.sendRedirect("SubjectServlet");
				}
				else {
					//response.sendRedirect("register.html");
					RequestDispatcher dispatcher = request.getRequestDispatcher("addSubject.jsp");
					PrintWriter out = response.getWriter();
					out.println("<p>Unable to add subject to master list</p>");
					dispatcher.include(request, response);
				}
			} catch (SQLException e) {
				// keep me on registration page
				response.sendRedirect("addSubject.jsp");
				
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
