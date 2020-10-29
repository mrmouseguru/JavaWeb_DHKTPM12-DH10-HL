package vn.edu.iuh.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.beans.User;

/**
 * Servlet implementation class XuLyDangKy
 */
@WebServlet("/xuLyDangKy")
public class XuLyDangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XuLyDangKy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType(type);
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		User user = new User(firstName, lastName);
		
		
		//ĐÓNG HỘP THÔNG TIN
		request.setAttribute("user", user);
		
		//CHUYỂN TIẾP forward
		
		//SERVLET KHÁC
		//TRANG HTML KHÁC
		//TRANG JSP KHÁC
		
		/*
		 * RequestDispatcher dispatcher =
		 * request.getServletContext().getRequestDispatcher("/forwardServlet"); //CHUYỂN
		 * ĐI NÈ dispatcher.forward(request, response);
		 */
		
		response.sendRedirect(request.getContextPath() + "/redirectServlet");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
