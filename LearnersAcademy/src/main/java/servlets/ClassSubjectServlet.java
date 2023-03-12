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
 * Servlet implementation class ClassSubjectServlet
 */
@WebServlet("/ClassSubjectServlet")
public class ClassSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

					String classid = request.getParameter("class");
					String subjectid = request.getParameter("subject");
					
					if(classid == null || classid.isEmpty())
					{
					response.sendRedirect("AssignClassServlet?error=Class cannot be null");
						return;
					}
					if(subjectid == null || subjectid.isEmpty())
					{
						response.sendRedirect("AssignClassServlet?error=subject cannot empty");
						return;
					}
					LearnerClassDB db3 = new LearnerClassDB();
					
					LearnerClass learnerclass = new LearnerClass();
					learnerclass.setClass_id(Integer.valueOf(classid));
					learnerclass.setSubject_id(Integer.valueOf(subjectid));		
			
					try {
					if(db3.AssignClassUsingPrepareStatement(learnerclass)) {
							// take me to which page? login page
							response.sendRedirect("LearnerClassServlet");
						}
						else {
							//response.sendRedirect("register.html");
							RequestDispatcher dispatcher = request.getRequestDispatcher("AssignClassServlet");
							PrintWriter out = response.getWriter();
							out.println("<p>Unable to assign class to subject</p>");
							dispatcher.include(request, response);
						}
					} catch (SQLException e) {
						// keep me on registration page
						response.sendRedirect("AssignClassServlet");
						
					}
			}
				//default:

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
