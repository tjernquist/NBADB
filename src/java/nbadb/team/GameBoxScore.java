package nbadb.team;

/**
 *
 * @author Adis
 */
public class GameBoxScore {

    private int gameID;
    private int teamId;
    private String teamAbbreviation;
    private int q1Points;
    private int q2Points;
    private int q3Points;
    private int q4Points;
    private int ot1Points;
    private int ot2Points;
    private int ot3Points;
    private int totalPoints;

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }

    public int getQ1Points() {
        return q1Points;
    }

    public void setQ1Points(int q1Points) {
        this.q1Points = q1Points;
    }

    public int getQ2Points() {
        return q2Points;
    }

    public void setQ2Points(int q2Points) {
        this.q2Points = q2Points;
    }

    public int getQ3Points() {
        return q3Points;
    }

    public void setQ3Points(int q3Points) {
        this.q3Points = q3Points;
    }

    public int getQ4Points() {
        return q4Points;
    }

    public void setQ4Points(int q4Points) {
        this.q4Points = q4Points;
    }

    public int getOt1Points() {
        return ot1Points;
    }

    public void setOt1Points(int ot1Points) {
        this.ot1Points = ot1Points;
    }

    public int getOt2Points() {
        return ot2Points;
    }

    public void setOt2Points(int ot2Points) {
        this.ot2Points = ot2Points;
    }

    public int getOt3Points() {
        return ot3Points;
    }

    public void setOt3Points(int ot3Points) {
        this.ot3Points = ot3Points;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "GameBoxScore{" + "gameID=" + gameID + ", teamId=" + teamId + ", teamAbbreviation=" + teamAbbreviation + ", q1Points=" + q1Points + ", q2Points=" + q2Points + ", q3Points=" + q3Points + ", q4Points=" + q4Points + ", ot1Points=" + ot1Points + ", ot2Points=" + ot2Points + ", ot3Points=" + ot3Points + ", totalPoints=" + totalPoints + '}';
    }

}
