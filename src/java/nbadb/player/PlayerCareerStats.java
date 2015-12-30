package nbadb.player;

import com.google.gson.JsonArray;

public class PlayerCareerStats implements PlayerStat {

    private int playerID;
    private String seasonID;
    private String team;
    private int playerAge;
    private int gamesPlayed;
    private int gamesStarted;
    private float minutesPlayed;

    private float fga;
    private float fgm;
    private float fgPct;
    private float fg3m;
    private float fg3a;
    private float fg3PCt;
    private float ftm;
    private float fta;
    private float ftPct;
    private float oReb;
    private float dReb;
    private float reb;
    private float ast;
    private float stl;
    private float blk;
    private float tos;
    private float pfs;
    private float pts;

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getSeasonID() {
        return seasonID;
    }

    public void setSeasonID(String seasonID) {
        this.seasonID = seasonID;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    


    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int age) {
        this.playerAge = age;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public float getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(float minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public float getFga() {
        return fga;
    }

    public void setFga(float fga) {
        this.fga = fga;
    }

    public float getFgm() {
        return fgm;
    }

    public void setFgm(float fgm) {
        this.fgm = fgm;
    }

    public float getFgPct() {
        return fgPct;
    }

    public void setFgPct(float fgPct) {
        this.fgPct = fgPct;
    }

    public float getFg3m() {
        return fg3m;
    }

    public void setFg3m(float fg3m) {
        this.fg3m = fg3m;
    }

    public float getFg3a() {
        return fg3a;
    }

    public void setFg3a(float fg3a) {
        this.fg3a = fg3a;
    }

    public float getFg3PCt() {
        return fg3PCt;
    }

    public void setFg3PCt(float fg3PCt) {
        this.fg3PCt = fg3PCt;
    }

    public float getFtm() {
        return ftm;
    }

    public void setFtm(float ftm) {
        this.ftm = ftm;
    }

    public float getFta() {
        return fta;
    }

    public void setFta(float fta) {
        this.fta = fta;
    }

    public float getFtPct() {
        return ftPct;
    }

    public void setFtPct(float ftPct) {
        this.ftPct = ftPct;
    }

    public float getoReb() {
        return oReb;
    }

    public void setoReb(float oReb) {
        this.oReb = oReb;
    }

    public float getdReb() {
        return dReb;
    }

    public void setdReb(float dReb) {
        this.dReb = dReb;
    }

    public float getReb() {
        return reb;
    }

    public void setReb(float reb) {
        this.reb = reb;
    }

    public float getAst() {
        return ast;
    }

    public void setAst(float ast) {
        this.ast = ast;
    }

    public float getStl() {
        return stl;
    }

    public void setStl(float stl) {
        this.stl = stl;
    }

    public float getBlk() {
        return blk;
    }

    public void setBlk(float blk) {
        this.blk = blk;
    }

    public float getTos() {
        return tos;
    }

    public void setTos(float to) {
        this.tos = to;
    }

    public float getPfs() {
        return pfs;
    }

    public void setPfs(float pf) {
        this.pfs = pf;
    }

    public float getPts() {
        return pts;
    }

    public void setPts(float pts) {
        this.pts = pts;
    }

    @Override
    public void addPlayerStat(JsonArray array) {
        throw new UnsupportedOperationException("Todo"); 
        
    }


}
