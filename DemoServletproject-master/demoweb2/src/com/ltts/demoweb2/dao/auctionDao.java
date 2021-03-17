package com.ltts.demoweb2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demoweb2.configure.MyConnection;
import com.ltts.demoweb2.model.Auction;

public class auctionDao {
	
	public boolean insertAuction(Auction p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?)");
		ps.setInt(1, p. getAuc_id());
		ps.setInt(2, p. getPlayer_id());
		ps.setInt(3, p.getTeam_id());
		ps.setInt(4, p.getAmount());
		
		
		return ps.execute();
	}
	
	public List<Auction> getAllAuction() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from auction");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
			
		}
		return li;
}
}
