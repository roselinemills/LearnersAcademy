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

import database.TeacherDB;

/**
 * Servlet implementation class Teacher_Class
 */
@WebServlet("/TeacherClassServlet")
public class TeacherClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String teacherid = request.getParameter("teacher");
		String classid = request.getParameter("class");
		
		if(classid == null || classid.isEmpty())
		{
		response.sendRedirect("AssignTeacherServlet?error= Class cannot be null");
			return;
		}
		if(teacherid == null || teacherid.isEmpty())
		{
			response.sendRedirect("AssignTeacherServlet?error= Teacher cannot empty");
			return;
		}
		
		TeacherDB database = new TeacherDB();
		//Teacher teacher = new Teacher ();
		try {
			if (database.AssignTeacherUsingPrepareStatement(teacherid,classid)) {
				response.sendRedirect("ViewTeacherServlet");
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("AssignTeacherServlet");
				PrintWriter out = response.getWriter();
				out.println("<p>Unable to assign teacher to class</p>");
				dispatcher.include(request, response);
			}
			
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
