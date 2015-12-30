package nbadb.player;

import com.google.gson.JsonArray;

public class PlayerBoxScore implements PlayerStat {

    private int gameID;
    private String gamecode;
    private String playerName;
    private int playerID;
    private String minutesPlayed;
    private int fga;
    private int fgm;
    private float fgPct;
    private int fg3m;
    private int fg3a;
    private float fg3PCt;
    private int ftm;
    private int fta;
    private float ftPct;
    private int oReb;
    private int dReb;
    private int reb;
    private int ast;
    private int stl;
    private int blk;
    private int to;
    private int pf;
    private int pts;
    private int plusMinus;
    private String teamAbbreviation;

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }

    public String getGamecode() {
        return gamecode;
    }

    public void setGamecode(String gamecode) {
        this.gamecode = gamecode;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(String minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getFga() {
        return fga;
    }

    public void setFga(int fga) {
        this.fga = fga;
    }

    public int getFgm() {
        return fgm;
    }

    public void setFgm(int fgm) {
        this.fgm = fgm;
    }

    public float getFgPct() {
        return fgPct;
    }

    public void setFgPct(float fgPct) {
        this.fgPct = fgPct;
    }

    public int getFg3m() {
        return fg3m;
    }

    public void setFg3m(int fg3m) {
        this.fg3m = fg3m;
    }

    public int getFg3a() {
        return fg3a;
    }

    public void setFg3a(int fg3a) {
        this.fg3a = fg3a;
    }

    public float getFg3PCt() {
        return fg3PCt;
    }

    public void setFg3PCt(float fg3PCt) {
        this.fg3PCt = fg3PCt;
    }

    public int getFtm() {
        return ftm;
    }

    public void setFtm(int ftm) {
        this.ftm = ftm;
    }

    public int getFta() {
        return fta;
    }

    public void setFta(int fta) {
        this.fta = fta;
    }

    public float getFtPct() {
        return ftPct;
    }

    public void setFtPct(float ftPct) {
        this.ftPct = ftPct;
    }

    public int getoReb() {
        return oReb;
    }

    public void setoReb(int oReb) {
        this.oReb = oReb;
    }

    public int getdReb() {
        return dReb;
    }

    public void setdReb(int dReb) {
        this.dReb = dReb;
    }

    public int getReb() {
        return reb;
    }

    public void setReb(int reb) {
        this.reb = reb;
    }

    public int getAst() {
        return ast;
    }

    public void setAst(int ast) {
        this.ast = ast;
    }

    public int getStl() {
        return stl;
    }

    public void setStl(int stl) {
        this.stl = stl;
    }

    public int getBlk() {
        return blk;
    }

    public void setBlk(int blk) {
        this.blk = blk;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getPf() {
        return pf;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public int getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(int plusMinus) {
        this.plusMinus = plusMinus;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void addPlayerStat(JsonArray array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
