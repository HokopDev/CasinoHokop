package fr.hokop.casino.managers;

import fr.hokop.casino.Casino;
import org.bukkit.entity.Player;

/**
 * Created by vgfab on 29/10/2016.
 */
public class PlayersManager{

    private Player player;

    /**
     * Constructeur pour créer un joueur custom
     *
     * @param player    On définit le joueur a qui on va set des donnée
     */
    public PlayersManager(Player player){
        this.player = player;

        initPlayer();
    }

    /**
     * On Initialize les données du joueur
     */
    public void initPlayer(){
        player.teleport(Casino.getInstance().getSettings().getLocations()[0]);
    }
}
