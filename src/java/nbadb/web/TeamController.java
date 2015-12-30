package nbadb.web;

import nbadb.DAO.PlayerJDBCTemplate;
import nbadb.DAO.TeamJDBCTemplate;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeamController {

    @Autowired
    TeamJDBCTemplate t;

    @Autowired
    PlayerJDBCTemplate p;

    public void setTeamDAO(TeamJDBCTemplate template) {
        this.t = template;
    }

    public void setPlayerDAO(PlayerJDBCTemplate template) {
        this.p = template;
    }

    //Populates the a specific teams page with previous games
    @RequestMapping(value = "/Team/{id}", method = RequestMethod.GET)
    public ModelAndView listTeam(@PathVariable("id") int id) throws IOException {

        ModelAndView m = new ModelAndView("gameheaders");
        m.addObject("gameheader", t.getGameHeader(id));

        return m;

    }

    //Populates a specific games page with boxscores for both respective team and every player involved in said game
    @RequestMapping(value = "/Game/{id}", method = RequestMethod.GET)
    public ModelAndView listGameBoxscore(@PathVariable("id") int id) throws IOException {

        ModelAndView m = new ModelAndView("game");

        m.addObject("gameboxscore", t.getGameBoxscore(id));
        m.addObject("playerboxscore", p.findPlayerBoxscoresForGame(id));

        return m;

    }

}
