/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbadb.DAO;

import nbadb.team.GameBoxScore;
import nbadb.team.GameHeader;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class TeamJDBCTemplate implements TeamDAO {

    private JdbcTemplate template;

    @Override
    public void setDataSource(DataSource datasource) {
        this.template = new JdbcTemplate(datasource);
    }
    
    
    //Returns a list containing all gameheadersfor a specific team
    public List<TeamDAO> getGameHeader(int teamid) {
        String SQL = "SELECT * FROM gameheader WHERE HomeTeamID=" + teamid + " OR  AwayTeamId=" + teamid + "";
        List<TeamDAO> gameheader = template.query(SQL, new BeanPropertyRowMapper(GameHeader.class));
        return gameheader;
    }

    //Returns the boxscores (i.e. number of points scored/quarter) for both teams for a specific game
    public List<TeamDAO> getGameBoxscore(int gameid) {

        String SQL = "SELECT TeamAbbreviation, Q1Points, Q2Points, Q3Points, Q4Points, OT1Points,OT2Points, OT3Points, TotalPoints "
                + "FROM teamboxscore WHERE GameID=" + gameid + "";
        List<TeamDAO> gameheader = template.query(SQL, new BeanPropertyRowMapper(GameBoxScore.class));

        return gameheader;
    }

}
