package com.ltts.demoweb2.model;

public class Player {

	private int playerId;
	private String playerName;
	private String country;
	String sDate1;
	
	
	public Player(int playerId, String playerName, String country, String sDate1) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
		this.sDate1 = sDate1;
	}


	public Player() {
		// TODO Auto-generated constructor stub
		super();
	}


	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public String getsDate1() {
		return sDate1;
	}


	public void setsDate1(String sDate1) {
		this.sDate1 = sDate1;
	}
	
	
	
	
	
	
	
}
