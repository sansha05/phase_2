package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Product;
import com.util.HibernateUtil;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/add-product")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
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
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		String product_name = request.getParameter("product-name");
		String price = request.getParameter("price");
		
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		
		Product p1 = new Product(1, product_name, Double.parseDouble(price));
		
		Transaction tx = session.beginTransaction();
		session.save(p1);
		
		tx.commit();
		
		session.close();
		sf.close();
		
		
		out.println("<h2>your product added</h2>");
		out.println("</html></body>");
		
	}

}
