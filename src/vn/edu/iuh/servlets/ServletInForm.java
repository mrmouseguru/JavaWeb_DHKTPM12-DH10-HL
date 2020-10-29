package vn.edu.iuh.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInForm
 */
@WebServlet("/processForm")
public class ServletInForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//LẤY THÔNG TIN
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		//PHẢN HỒI THÔNG TIN
		ServletOutputStream out = response.getOutputStream();
		 
        out.println("<html>");
        out.println("<head><title>Thong Tin Dang Ky</title></head>");
 
        out.println("<body>");
        out.println("<h3>Thong tin Dang Ky</h3>");
        out.println("<p>First Name = " + firstName + "</p>");
        out.println("<p>Last Name = " + lastName + "</p>");
        out.println("</body>");
        out.println("<html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
