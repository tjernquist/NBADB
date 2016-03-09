
import nbadb.DAO.PlayerJDBCTemplate;
import nbadb.player.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {

    nbadb.player.Player p;
    nbadb.DAO.PlayerJDBCTemplate t;

    @Before
    public void before() {
        p = new Player();
        p.setPlayerName("Adis");
        t = new PlayerJDBCTemplate();

    }

    @Test
    public void test() {
        System.out.println(p.getPlayerName());
        Assert.assertEquals("Adis", p.getPlayerName());
        Assert.assertEquals("Garnett", t.getPlayer(708).getPlayerName());
    }

}
