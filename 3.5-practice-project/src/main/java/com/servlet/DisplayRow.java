package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.util.HibernateUtil;

/**
 * Servlet implementation class DisplayRow
 */
@WebServlet("/list-table")
public class DisplayRow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayRow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		
		List<Student> students = session.createQuery("from Student").list();
		System.out.println(students);
		
		PrintWriter out  = response.getWriter();
		out.println("<html><body>");
		out.println("<table>");
		out.println("<tr><th>student_id</th><th>name</th><th>roll no</th></tr>");
		
		for (Student s: students) {
			out.println("<tr>");
			out.println("<td>"+s.getId()+"</td> " + " <td>" + s.getName()+ "</td> "+ "<td> " + s.getRollno() +"</td>");
			
			out.println("</tr>");
			
		}
		session.close();
		
		out.println("</table>");
		out.print("</body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
