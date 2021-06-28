package com.ltts.demoSpring.model;


public class Player {

	private int playerNo;
	private String playerName;
	private int teamNo;
	private String mobile;
	private int totalRuns;
	
	
	
	public Player() {
		super();
	}



	public Player(int playerNo, String playerName, int teamNo, String mobile, int totalRuns) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.teamNo = teamNo;
		this.mobile = mobile;
		this.totalRuns = totalRuns;
	}



	public int getPlayerNo() {
		return playerNo;
	}



	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getTeamNo() {
		return teamNo;
	}



	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public int getTotalRuns() {
		return totalRuns;
	}



	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}



	@Override
	public String toString() {
		return "Player playerNo=" + playerNo + ", playerName=" + playerName + ", teamNo=" + teamNo + ", mobile="
				+ mobile + ", totalRuns=" + totalRuns;
	}
	
	

}
