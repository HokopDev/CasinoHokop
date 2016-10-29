package fr.hokop.casino.managers;

import fr.hokop.casino.Casino;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Created by vgfab on 29/10/2016.
 */
public class PlayersManager{

    private Player player;

    @Getter private static HashMap<Player, PlayersManager> playersList = new HashMap<>();

    @Getter @Setter private Integer jetons;

    /**
     *constructor for create a custom player
     *
     * @param player    initialization of player
     */
    public PlayersManager(Player player){
        this.player = player;

        this.jetons = 1000;

        playersList.put(player, this);
    }
}
