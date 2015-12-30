/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbadb.DAO;

import nbadb.player.Player;
import nbadb.player.PlayerBoxScore;
import nbadb.player.PlayerCareerStats;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adis
 */
public class PlayerJDBCTemplate implements PlayerDAO {

    private JdbcTemplate template;

    public void setDataSource(DataSource datasource) {
        this.template = new JdbcTemplate(datasource);
    }

    //Search and return a single Player-object from database
    public Player getPlayer(Integer id) throws org.springframework.dao.EmptyResultDataAccessException {

        String SQL = "SELECT * FROM playergeneralstats WHERE PlayerID = ?";
        Player player = (Player) template.queryForObject(SQL, new Object[]{id}, new PlayerMapper());
        return player;

    }

    //Returns a list of every player featured in the playergeneralstats table
    public List<PlayerDAO> findAll() {
        String SQL = "SELECT * FROM playergeneralstats ORDER BY PPG desc";

        List<PlayerDAO> players = template.query(SQL, new BeanPropertyRowMapper(Player.class));

        return players;
    }

    //Returns a list containing all boxscores for a specific player
    public List<PlayerDAO> findPlayerBoxscore(int playerid) {
        String SQL = "SELECT * FROM vyy where playerID =" + playerid + "";

        List<PlayerDAO> players = template.query(SQL, new BeanPropertyRowMapper(PlayerBoxScore.class));

        return players;
    }

    //Returns a list containing all boxscores for a specific game
    public List<PlayerDAO> findPlayerBoxscoresForGame(int gameid) {
        String SQL = "SELECT * FROM vyy1 WHERE gameID=00" + gameid + "";
        List<PlayerDAO> players = template.query(SQL, new BeanPropertyRowMapper(PlayerBoxScore.class));
        return players;
    }

    //Returns a list containing a specific players full stat history
    public List<PlayerDAO> findAllPlayerCareerStats(int playerid) {
        String SQL = "SELECT * FROM careervy WHERE playerID=" + playerid + "";

        List<PlayerDAO> players = template.query(SQL, new BeanPropertyRowMapper(PlayerCareerStats.class));

        return players;
    }

    public void insertGeneralPlayerStat(Player p) {
        String SQL = "INSERT INTO playergeneralstats (PlayerID, PlayerName, ActivePlayer, PPG, APG, RPG) VALUES (?,?,?,?,?,?)";
        template.update(SQL, new Object[]{p.getPlayerID(), p.getPlayerName(), p.getActivePlayer(), p.getPPG(), p.getAPG(), p.getRPG()});
    }

}
