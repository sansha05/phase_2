package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Player;
import com.entity.Team;
import com.util.HibernateUtil;

/**
 * Servlet implementation class AddPlayer
 */
@WebServlet("/add-player")
public class AddPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlayer() {
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
		String playerName=request.getParameter("playername");
		String team1 =request.getParameter("team1");
		String team2=request.getParameter("team2");
		String team3=request.getParameter("team3");
		
		Player p = new Player();
		Team t1 = new Team();
		Team t2 = new Team();
		Team t3 = new Team();
		
		List<Team> teamlist = new ArrayList<>();
		teamlist.add(t1);
		teamlist.add(t2);
		teamlist.add(t3);
		
		t1.setTeamName(team1);
		t2.setTeamName(team2);
		t3.setTeamName(team3);
		p.setPlayerName(playerName);
		p.setTeam(teamlist);
		
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(t1);
		ses.save(t2);
		ses.save(t3);
		ses.save(p);
		tx.commit();
		ses.close();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html></body>");
		out.println("<h3>record add</h3>");
		out.println("<a href='Display'>click to show record </a>");
		
	}

}
