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
import entity.Teacher;

/**
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet("/AddTeacherServlet")
public class AddTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		
			if(firstname == null || firstname.isEmpty())
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("addTeacher.jsp");
				request.setAttribute("error", "firstname cannot be null");
				request.setAttribute("lastname", lastname);
				request.setAttribute("phonenumber", phonenumber);
				request.setAttribute("email", email);
				dispatcher.forward(request, response);
				//response.sendRedirect("register.jsp?error=Email cannot be null");
				return;
			}
			if(lastname == null || lastname.isEmpty())
			{
				response.sendRedirect("addTeacher.jsp?error=lastname cannot be empty");
				return;
			}
			if(phonenumber == null || phonenumber.isEmpty())
			{
				response.sendRedirect("addTeacher.jsp?error=phonenumber cannot be empty");
				return;
			}
			TeacherDB db = new TeacherDB();
			
			Teacher t1 = new Teacher();
			t1.setEmail(email);
			t1.setFirst_name(firstname);
			t1.setLast_name(lastname);
			t1.setPhone_number(phonenumber);
	
			try {
			if(db.AddTeacherUsingPrepareStatement(t1)) {
					// take me to which page? login page
					response.sendRedirect("ViewTeacherServlet");
				}
				else {
					//response.sendRedirect("register.html");
					RequestDispatcher dispatcher = request.getRequestDispatcher("addTeacher.jsp");
					PrintWriter out = response.getWriter();
					out.println("<p>Unable to add teacher to master list</p>");
					dispatcher.include(request, response);
				}
			} catch (SQLException e) {
				// keep me on registration page
				response.sendRedirect("addTeacher.jsp");
				
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
