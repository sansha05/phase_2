package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconfig.DatabaseProvider;
import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q = "select * from employee";
		
		try {
			Connection con = DatabaseProvider.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet st= stmt.executeQuery(q);
			
			PrintWriter out  = response.getWriter();
			out.println("<html><body>");
			
			while(st.next()) {
				out.println("<h4>" + st.getInt("EmpId")+ "  " + st.getString("EmpName")+ "  " + st.getInt("EmpAge")+ "  " + st.getInt("EmpSalary") + "</h4>");
			}
			out.println("</body></html>");
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
