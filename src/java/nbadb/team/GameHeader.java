package nbadb.team;

import java.util.Date;

/**
 *
 * @author Adis
 */
public class GameHeader {
    
    private Date gameDate;
    private String gameID;
    private String gamecode;
    private int homeTeamID;
    private int awayTeamID;
    private int noPeriods;

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public String getGamecode() {
        return gamecode;
    }

    public void setGamecode(String gamecode) {
        this.gamecode = gamecode;
    }

    public int getHomeTeamID() {
        return homeTeamID;
    }

    public void setHomeTeamID(int homeTeamID) {
        this.homeTeamID = homeTeamID;
    }

    public int getAwayTeamID() {
        return awayTeamID;
    }

    public void setAwayTeamID(int awayTeamID) {
        this.awayTeamID = awayTeamID;
    }

    public int getNoPeriods() {
        return noPeriods;
    }

    public void setNoPeriods(int noPeriods) {
        this.noPeriods = noPeriods;
    }

}
