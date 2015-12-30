package nbadb.web;

import nbadb.DAO.PlayerJDBCTemplate;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayerController {

    @Autowired
    PlayerJDBCTemplate t;

    public void setPlayerDAO(PlayerJDBCTemplate template) {
        this.t = template;
    }

    @RequestMapping(value = "/")
    public String test() {
        return "index";
    }

    //Populates a specific players page with careerstats, boxscores and basic playerinformation
    @RequestMapping(value = "/Player/{id}", method = RequestMethod.GET)
    public ModelAndView listPlayersBoxscore(@PathVariable("id") int id) throws IOException {

        ModelAndView m = new ModelAndView("playerBio");

        m.addObject("playercareerstats", t.findAllPlayerCareerStats(id));
        m.addObject("playerboxscore", t.findPlayerBoxscore(id));
        m.addObject("player", t.getPlayer(id));

        return m;

    }

}
