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
import entity.LearnerClass;

/**
 * Servlet implementation class LearnerClassServlet
 */
@WebServlet("/LearnerClassServlet")
public class LearnerClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LearnerClassServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LearnerClassDB db = new LearnerClassDB();
		 try {
		List<LearnerClass> classes = db.getAllClasses();
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewClasses.jsp");
		request.setAttribute("classes", classes);
		dispatcher.forward(request, response);
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
