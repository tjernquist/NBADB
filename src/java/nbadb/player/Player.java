package nbadb.player;

import nbadb.DAO.PlayerJDBCTemplate;
import com.google.gson.JsonArray;

public class Player implements PlayerStat {

    private int playerId;
    private String PlayerName;
    private String activePlayer;
    private float PPG;
    private float APG;
    private float RPG;

    private PlayerJDBCTemplate jdbc;

    public void setJDBC(PlayerJDBCTemplate j) {
        this.jdbc = j;
    }

    public int getPlayerID() {
        return playerId;
    }

    public void setPlayerID(int PlayerID) {
        this.playerId = PlayerID;
    }

    public String getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(String activePlayer) {
        this.activePlayer = activePlayer;
    }

    public float getPPG() {
        return PPG;
    }

    public void setPPG(float PPG) {
        this.PPG = PPG;
    }

    public float getAPG() {
        return APG;
    }

    public void setAPG(float APG) {
        this.APG = APG;
    }

    public float getRPG() {
        return RPG;
    }

    public void setRPG(float RPG) {
        this.RPG = RPG;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String name) {
        this.PlayerName = name;
    }

    @Override
    public String toString() {
        return "Player{" + "PlayerID=" + playerId + ", name=" + PlayerName + ", activePlayer=" + activePlayer + ", PPG=" + PPG + ", APG=" + APG + ", RPG=" + RPG + '}';
    }

    @Override
    public void addPlayerStat(JsonArray array) {

        Player p = new Player();

        p.setPlayerID(array.get(0).getAsInt());
        p.setPlayerName(array.get(1).getAsString());
        p.setActivePlayer(array.get(2).getAsString());
        p.setPPG(array.get(3).getAsFloat());
        p.setAPG(array.get(4).getAsFloat());
        p.setRPG(array.get(5).getAsFloat());

        jdbc.insertGeneralPlayerStat(p);

    }

}
