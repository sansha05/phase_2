package com.servlet;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconfig.DatabaseProvider;


/**
* Servlet implementation class DBOperations
*/
@WebServlet("/dboperations")
public class DBOperations extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public DBOperations() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                         
                        
                        
                        Connection conn = DatabaseProvider.getConnection();
                        Statement stmt = conn.createStatement();
                        stmt.executeUpdate("create database mydatabase");
                        out.println("Created database: mydatabase<br>");
                        stmt.executeUpdate("use mydatabase");
                        out.println("Selected database: mydatabase<br>");
                        stmt.executeUpdate("drop database mydatabase");
                        stmt.close();
                        out.println("Dropped database: mydatabase<br>");
                        
                        
                        
                        
                        
                        conn.close();
                        
                        
                        out.println("</body></html>");
                       
                        
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (SQLException e) {
                        e.printStackTrace();
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
