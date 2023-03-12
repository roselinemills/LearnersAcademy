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

import database.LearnerSubjectDB;
import entity.LearnerSubject;

/**
 * Servlet implementation class SubjectServlet
 */
@WebServlet("/SubjectServlet")
public class ViewSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LearnerSubjectDB db = new LearnerSubjectDB();
		
		  try { List<LearnerSubject> subjects = db.getAllSubjects(); RequestDispatcher
		  dispatcher = request.getRequestDispatcher("subjects.jsp");
		  request.setAttribute("subjects", subjects); dispatcher.forward(request,
		  response); } catch (SQLException ex) { ex.printStackTrace(); }
	}
	
	/*
	 * ArrayList subjects1 = new ArrayList(); subjects1.get Object subjects =
	 * subjects1.get(0); //subjects1 = db.getAllSubjects();
	 * request.setAttribute("subjects", subjects);
	 * 
	 * 
	 * 
	 * //forward the request to jsp
	 * request.getRequestDispatcher("addSubject.jsp").forward(request, response); 
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
