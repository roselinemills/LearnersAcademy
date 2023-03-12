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
import database.LearnerSubjectDB;
import entity.LearnerClass;
import entity.LearnerSubject;

/**
 * Servlet implementation class AssignClassServlet
 */
@WebServlet("/AssignClassServlet")
public class AssignClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignClassServlet() {
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("assignClass.jsp");
		request.setAttribute("classes", classes);
		dispatcher.include(request, response);
	       
		 LearnerSubjectDB db2 = new LearnerSubjectDB();
		List<LearnerSubject> subjects = db2.getAllSubjects();
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("assignClass.jsp");
		request.setAttribute("subjects", subjects);
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
