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

import com.entity.Player;
import com.entity.Team;
import com.util.HibernateUtil;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		
		Player p = session.get(Player.class, 16);
		List<Team> teams = p.getTeam();

		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>player " + p.getPlayerName() + " is playing with:</h3>");
		
		for(Team t: teams) {
			out.println("<h4>" + t.getTeamName() +"</h4>");
		}
		
		out.println("</body></html>");
		
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
