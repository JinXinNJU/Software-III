package vo;

import enums.Teams;

public class MatchVO {
	//
	Teams team1;
	Teams team2;
	String date;
	String score;
	String score1;
	String score2;
	String score3;
	String score4;
	
	public MatchVO(Teams team1, Teams team2, String date, String score, String score1, String score2, 
			String score3, String score4){
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.score = score;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
	}

	public Teams getTeam1() {
		return team1;
	}

	public Teams getTeam2() {
		return team2;
	}
	
	public String getDate(){
		return date;
	}

	public String getScore() {
		return score;
	}

	public String getScore1() {
		return score1;
	}

	public String getScore2() {
		return score2;
	}

	public String getScore3() {
		return score3;
	}

	public String getScore4() {
		return score4;
	}
}