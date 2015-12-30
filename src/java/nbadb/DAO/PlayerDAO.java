package nbadb.DAO;

import nbadb.player.Player;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.stereotype.Component;


/**
 *
 * @author Adis
 */

@Component
public interface PlayerDAO {
    
    public void setDataSource(DataSource datasource);
    
    Player getPlayer(Integer id);
    
    List<PlayerDAO> findAll();
    
}
