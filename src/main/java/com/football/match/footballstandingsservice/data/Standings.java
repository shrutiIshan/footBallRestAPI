package com.football.match.footballstandingsservice.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Standings {

	@JsonProperty("country_name")
	private String countryName;
	@JsonProperty("league_id")
	private String leagueId;
	@JsonProperty("league_name")
	private String leagueName;
	@JsonProperty("team_id")
	private String team_id;
	@JsonProperty("team_name")
	private String team_name;
	@JsonProperty("overall_league_position")
	private String ovralLeaguePos;
	@JsonProperty("overall_league_payed")
	private String ovralLeaguePlayd;
	@JsonProperty("overall_league_W")
	private String ovralLeagueW;
	@JsonProperty("overall_league_D")
	private String ovralLeagueD;
	@JsonProperty("overall_league_L")
	private String ovralLeagueL;
	@JsonProperty("overall_league_GF")
	private String ovralLeagueGF;
	@JsonProperty("overall_league_GA")
	private String ovralLeagueGA;
	@JsonProperty("overall_league_PTS")
	private String ovralLeaguePts;
	@JsonProperty("home_league_position")
	private String homeLeaguePos;
	@JsonProperty("home_league_payed")
	private String homeLeaguePlayd;
	@JsonProperty("home_league_W")
	private String homeLeagueW;
	@JsonProperty("home_league_D")
	private String homeLeagueD;
	@JsonProperty("home_league_L")
	private String homeLeagueL;
	@JsonProperty("home_league_GF")
	private String homeLeagueGF;
	@JsonProperty("home_league_GA")
	private String homeLeagueGA;
	@JsonProperty("home_league_PTS")
	private String homeLeaguePts;
	@JsonProperty("away_league_position")
	private String awayLeaguePos;
	@JsonProperty("away_league_payed")
	private String awayLeaguePlayd;
	@JsonProperty("away_league_W")
	private String awayLeagueW;
	@JsonProperty("away_league_D")
	private String awayLeagueD;
	@JsonProperty("away_league_L")
	private String awayLeagueL;
	@JsonProperty("away_league_GF")
	private String awayLeagueGF;
	@JsonProperty("away_league_GA")
	private String awayLeagueGA;
	@JsonProperty("away_league_PTS")
	private String awayLeaguePts;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getOvralLeaguePos() {
		return ovralLeaguePos;
	}
	public void setOvralLeaguePos(String ovralLeaguePos) {
		this.ovralLeaguePos = ovralLeaguePos;
	}
	public String getOvralLeaguePlayd() {
		return ovralLeaguePlayd;
	}
	public void setOvralLeaguePlayd(String ovralLeaguePlayd) {
		this.ovralLeaguePlayd = ovralLeaguePlayd;
	}
	public String getOvralLeagueW() {
		return ovralLeagueW;
	}
	public void setOvralLeagueW(String ovralLeagueW) {
		this.ovralLeagueW = ovralLeagueW;
	}
	public String getOvralLeagueD() {
		return ovralLeagueD;
	}
	public void setOvralLeagueD(String ovralLeagueD) {
		this.ovralLeagueD = ovralLeagueD;
	}
	public String getOvralLeagueL() {
		return ovralLeagueL;
	}
	public void setOvralLeagueL(String ovralLeagueL) {
		this.ovralLeagueL = ovralLeagueL;
	}
	public String getOvralLeagueGF() {
		return ovralLeagueGF;
	}
	public void setOvralLeagueGF(String ovralLeagueGF) {
		this.ovralLeagueGF = ovralLeagueGF;
	}
	public String getOvralLeagueGA() {
		return ovralLeagueGA;
	}
	public void setOvralLeagueGA(String ovralLeagueGA) {
		this.ovralLeagueGA = ovralLeagueGA;
	}
	public String getOvralLeaguePts() {
		return ovralLeaguePts;
	}
	public void setOvralLeaguePts(String ovralLeaguePts) {
		this.ovralLeaguePts = ovralLeaguePts;
	}
	public String getHomeLeaguePos() {
		return homeLeaguePos;
	}
	public void setHomeLeaguePos(String homeLeaguePos) {
		this.homeLeaguePos = homeLeaguePos;
	}
	public String getHomeLeaguePlayd() {
		return homeLeaguePlayd;
	}
	public void setHomeLeaguePlayd(String homeLeaguePlayd) {
		this.homeLeaguePlayd = homeLeaguePlayd;
	}
	public String getHomeLeagueW() {
		return homeLeagueW;
	}
	public void setHomeLeagueW(String homeLeagueW) {
		this.homeLeagueW = homeLeagueW;
	}
	public String getHomeLeagueD() {
		return homeLeagueD;
	}
	public void setHomeLeagueD(String homeLeagueD) {
		this.homeLeagueD = homeLeagueD;
	}
	public String getHomeLeagueL() {
		return homeLeagueL;
	}
	public void setHomeLeagueL(String homeLeagueL) {
		this.homeLeagueL = homeLeagueL;
	}
	public String getHomeLeagueGF() {
		return homeLeagueGF;
	}
	public void setHomeLeagueGF(String homeLeagueGF) {
		this.homeLeagueGF = homeLeagueGF;
	}
	public String getHomeLeagueGA() {
		return homeLeagueGA;
	}
	public void setHomeLeagueGA(String homeLeagueGA) {
		this.homeLeagueGA = homeLeagueGA;
	}
	public String getHomeLeaguePts() {
		return homeLeaguePts;
	}
	public void setHomeLeaguePts(String homeLeaguePts) {
		this.homeLeaguePts = homeLeaguePts;
	}
	public String getAwayLeaguePos() {
		return awayLeaguePos;
	}
	public void setAwayLeaguePos(String awayLeaguePos) {
		this.awayLeaguePos = awayLeaguePos;
	}
	public String getAwayLeaguePlayd() {
		return awayLeaguePlayd;
	}
	public void setAwayLeaguePlayd(String awayLeaguePlayd) {
		this.awayLeaguePlayd = awayLeaguePlayd;
	}
	public String getAwayLeagueW() {
		return awayLeagueW;
	}
	public void setAwayLeagueW(String awayLeagueW) {
		this.awayLeagueW = awayLeagueW;
	}
	public String getAwayLeagueD() {
		return awayLeagueD;
	}
	public void setAwayLeagueD(String awayLeagueD) {
		this.awayLeagueD = awayLeagueD;
	}
	public String getAwayLeagueL() {
		return awayLeagueL;
	}
	public void setAwayLeagueL(String awayLeagueL) {
		this.awayLeagueL = awayLeagueL;
	}
	public String getAwayLeagueGF() {
		return awayLeagueGF;
	}
	public void setAwayLeagueGF(String awayLeagueGF) {
		this.awayLeagueGF = awayLeagueGF;
	}
	public String getAwayLeagueGA() {
		return awayLeagueGA;
	}
	public void setAwayLeagueGA(String awayLeagueGA) {
		this.awayLeagueGA = awayLeagueGA;
	}
	public String getAwayLeaguePts() {
		return awayLeaguePts;
	}
	public void setAwayLeaguePts(String awayLeaguePts) {
		this.awayLeaguePts = awayLeaguePts;
	}
	@Override
	public String toString() {
		return "Standings [countryName=" + countryName + ", leagueId=" + leagueId + ", leagueName=" + leagueName
				+ ", team_id=" + team_id + ", team_name=" + team_name + ", ovralLeaguePos=" + ovralLeaguePos
				+ ", ovralLeaguePlayd=" + ovralLeaguePlayd + ", ovralLeagueW=" + ovralLeagueW + ", ovralLeagueD="
				+ ovralLeagueD + ", ovralLeagueL=" + ovralLeagueL + ", ovralLeagueGF=" + ovralLeagueGF
				+ ", ovralLeagueGA=" + ovralLeagueGA + ", ovralLeaguePts=" + ovralLeaguePts + ", homeLeaguePos="
				+ homeLeaguePos + ", homeLeaguePlayd=" + homeLeaguePlayd + ", homeLeagueW=" + homeLeagueW
				+ ", homeLeagueD=" + homeLeagueD + ", homeLeagueL=" + homeLeagueL + ", homeLeagueGF=" + homeLeagueGF
				+ ", homeLeagueGA=" + homeLeagueGA + ", homeLeaguePts=" + homeLeaguePts + ", awayLeaguePos="
				+ awayLeaguePos + ", awayLeaguePlayd=" + awayLeaguePlayd + ", awayLeagueW=" + awayLeagueW
				+ ", awayLeagueD=" + awayLeagueD + ", awayLeagueL=" + awayLeagueL + ", awayLeagueGF=" + awayLeagueGF
				+ ", awayLeagueGA=" + awayLeagueGA + ", awayLeaguePts=" + awayLeaguePts + "]";
	}
	
}