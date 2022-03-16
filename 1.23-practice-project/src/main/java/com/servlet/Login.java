package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		session.setAttribute("userid", userid);
		session.setAttribute("password", password);
		
		if (userid.equals("sandeep") && password.equals("12345")) {
			response.sendRedirect("dashboard");
		} else {
			out.println("<html><body>");
			request.getRequestDispatcher("index.html").include(request, response);
			out.println("<p style='color:red'>enter cretential as provided</p>");
			out.println("</body></html>");
		}
		
	}

}
