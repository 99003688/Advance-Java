package com.ltts.demoweb2.model;

public class Auction {
	private int auc_id;
	private int player_id;
	private int team_id;
	private int amount;
	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auction(int auc_id, int player_id, int team_id, int amount) {
		super();
		this.auc_id = auc_id;
		this.player_id = player_id;
		this.team_id = team_id;
		this.amount = amount;
	}
	public int getAuc_id() {
		return auc_id;
	}
	public void setAuc_id(int auc_id) {
		this.auc_id = auc_id; 
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Auction [auc_id=" + auc_id + ", player_id=" + player_id + ", team_id=" + team_id + ", amount=" + amount
				+ "]";
	}

	
}