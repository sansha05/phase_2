package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.util.HibernateUtil;

/**
 * Servlet implementation class ListProduct
 */
@WebServlet("/list-product")
public class ListProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		
		List<Product> products = session.createQuery("from Product").list();
		
		out.println("<table>");
		out.print("<tr><th>id</th> <th>product name</th><th>price</th></tr>");
		for(Product p: products) {
			out.println("<tr><td>" + p.getId() + "</td>" + "<td>" + p.getProductName() + "</td><td>" + p.getPrice() + "</td></tr>");
		}
		out.print("</table>");
		
		out.println("<a href='index.html'>click here to add product</a>");
		out.print("</body></html>");
		
		session.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
