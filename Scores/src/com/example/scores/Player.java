package com.example.scores;


public class Player {
	int id;
	String pname;
	int round1=50;
	int round2;
	int round3;
	int round4;
	int round5;
	int round6;
	int totalscore;
	int cg_id;
	
	
	public  Player( String pname) {
	
		this.pname = pname;
	}
	
	//SETTER METHODS
	public void setCurGame(int cg_id){
		this.cg_id = cg_id;
	}
	public void setRound1(int round1) {
		this.round1 = round1;
	}
	public void setRound2(int round2) {
		this.round2 = round2;
	}
	public void setRound3(int round3) {
		this.round3 = round3;
	}
	public void setRound4(int round4) {
		this.round4 = round4;
	}
	public void setRound5(int round5) {
		this.round5 = round5;
	}
	public void setRound6(int round6) {
		this.round6 = round6;
	}
	public void setTotalScore(int totalscore){
		this.totalscore = totalscore;
	}

	//GETTER METHODS
	public int getCurGame(){
		return this.cg_id;
	}
	public String getPlayerName(){
		return this.pname;
	}
	public int getRound1() {
		return this.round1;
	}
	public int getRound2() {
		return this.round2;
	}
	public int getRound3() {
		return this.round3;
	}
	public int getRound4() {
		return this.round4;
	}
	public int getRound5() {
		return this.round5;
	}
	public int getRound6() {
		return this.round6;
	}
	public int getTotalScore() {
		return this.totalscore;
	}
	
}
