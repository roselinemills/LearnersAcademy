package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.LearnerClassDB;
import database.TeacherDB;
import entity.LearnerClass;
import entity.Teacher;

/**
 * Servlet implementation class AssignTeacherServlet
 */
@WebServlet("/AssignTeacherServlet")
public class AssignTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LearnerClassDB db = new LearnerClassDB();
		 try {
		List<LearnerClass> classes = db.getAllClasses();
		RequestDispatcher dispatcher = request.getRequestDispatcher("assignTeacher.jsp");
		request.setAttribute("classes", classes);
		dispatcher.include(request, response);
	       
		 TeacherDB db2 = new TeacherDB();
		List<Teacher> teachers = db2.getAllTeachers();
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("assignTeacher.jsp");
		request.setAttribute("teachers", teachers);
		dispatcher2.forward(request, response);
	        } catch (SQLException ex) {
	            ex.printStackTrace();
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
