package com.example.scores;

public class CurrentGame {
	
	int id;
	int noOfPlayers;
	String winner;
	
	//CONSTRUCTORS
	public CurrentGame(){
		
	};
	public CurrentGame(int id, int noOfPlayers) {
		this.id=id;
		this.noOfPlayers = noOfPlayers;
	}
	
	
	//SETTER METHODS
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	
	//GETTER METHODS
	public int getID() {
		return this.id;
	}
	public int getNoOfPlayers() {
		return this.noOfPlayers;
	}
	public String getWinner() {
		return this.winner;
	}

}
