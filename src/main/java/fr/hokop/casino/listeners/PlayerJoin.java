package fr.hokop.casino.listeners;

import fr.hokop.casino.managers.PlayersManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by vgfab on 29/10/2016.
 */
public class PlayerJoin implements Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        new PlayersManager(player); //on créer un nouveau joueur

    }
}
