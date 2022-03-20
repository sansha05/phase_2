package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconfig.DatabaseProvider;

/**
 * Servlet implementation class Details
 */
@WebServlet("/details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =  request.getParameter("id");
		String q = "select * from eproduct_123 where product_id=?";
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		try {
			Connection con = DatabaseProvider.getConnection();
			PreparedStatement stmt =  con.prepareStatement(q);
			stmt.setInt(1, Integer.parseInt(id));
			
			ResultSet set = stmt.executeQuery();
			
			out.println("<table");
			out.println("<tr><th>product-id</th><th>product-name</th><th>product-price</th></tr>");
			while (set.next()) {
				out.println("<tr>");
				out.println("<td>" + set.getInt("product_id") + "</td>" + "<td>" + set.getString("product_name") + "</td>" + "<td>" + set.getInt("product_price") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
