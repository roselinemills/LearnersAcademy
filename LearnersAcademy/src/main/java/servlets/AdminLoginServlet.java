package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.UserDB;

/**
 * Servlet implementation class adminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		
		UserDB db = new UserDB();
		try {
			if(db.validateUser(username, password)) {
				request.setAttribute("username", username);
				
				HttpSession session = request.getSession();
				session.setAttribute("id", username);
				response.sendRedirect("dashboard.jsp");
			}
			else {
				//response.sendRedirect("index.jsp?error=Invalid Credentials");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
				PrintWriter out = response.getWriter();
				out.println("Invalid credentials");
				dispatcher.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.jsp?error=something went wrong");
		}
	}
}
