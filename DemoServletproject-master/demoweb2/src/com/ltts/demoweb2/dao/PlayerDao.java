package com.ltts.demoweb2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demoweb2.configure.MyConnection;
import com.ltts.demoweb2.model.Player;


public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into web_player values(?,?,?,?)");
		ps.setInt(1, p.getPlayerId());
		ps.setString(2, p.getPlayerName());
		ps.setString(3, p.getCountry());
		ps.setString(4, p.getsDate1());

		return ps.execute();
		//return false;

		
	}
	
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from web_player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			
		}
		return li;

}
	public Player getAllPlayerById(int id) throws Exception
	{
		Player p= new Player();
		List<Player> li=new ArrayList<Player>();
		li=getAllPlayers();
		
		for(Player p1:li)
		{
			if(p1.getPlayerId()==id)
			{
				p.setPlayerId(id);
				p.setPlayerName(p1.getPlayerName());
				p.setCountry(p1.getCountry());
			}
		}
		return p;
	}
	public Boolean updateplayer(int id,String pname,String count) throws Exception
	{
		Connection con= MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE web_player SET playerName=?,country=? where playerId=?");
		ps.setString(1,pname);
		ps.setString(2, count);
		ps.setInt(3,id);
		Boolean b=ps.execute();
		return b;
	}
	
	
	
}
