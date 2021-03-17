package com.ltts.demoweb2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.demoweb2.dao.PlayerDao;
import com.ltts.demoweb2.dao.TeamDao;
import com.ltts.demoweb2.model.Player;
import com.ltts.demoweb2.model.Team;

/**
 * Servlet implementation class InsertTeamServlet
 */
@WebServlet("/InsertTeamServlet")
public class InsertTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int no=Integer.parseInt(request.getParameter("teamId"));
		String name=request.getParameter("teamname");
		String ownerName=request.getParameter("ownerName");
		String coachName=request.getParameter("coachName");
		int playerId=Integer.parseInt(request.getParameter("playerId"));
		Team t= new Team(no,name,ownerName,coachName,playerId);
		System.out.println("Inside Servlet: "+t);
		TeamDao td=new TeamDao();
		boolean b=false;
		try {
			b=td.insertTeam(t); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
