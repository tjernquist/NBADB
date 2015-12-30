/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbadb.DAO;

import nbadb.player.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Adis
 */

/*
    An example of a "manual" class mapper
*/
public class PlayerMapper implements RowMapper<Player> {

    @Override
    public Player mapRow(ResultSet rs, int i) throws SQLException {
        Player player = new Player();
        player.setPlayerID(rs.getInt("PlayerID"));
        player.setPlayerName(rs.getString("PlayerName"));
        player.setActivePlayer(rs.getString("ActivePlayer"));
        player.setPPG(rs.getFloat("PPG"));
        player.setAPG(rs.getFloat("APG"));
        player.setRPG(rs.getFloat("RPG"));

        return player;
    }

}
