package fr.hokop.casino.listeners;

import fr.hokop.casino.Casino;
import fr.hokop.casino.managers.PlayersManager;
import org.bukkit.GameMode;
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
        event.setJoinMessage(null);

        new PlayersManager(player);
        player.teleport(Casino.getInstance().getSettings().getLocations()[0]);
        player.setGameMode(GameMode.ADVENTURE);
        player.sendMessage("§bBienvenue au casino, §e"+player.getName()+"\n§6Vous avez §c"+PlayersManager.getPlayersList().get(player).getJetons()+" jetons§6.");
        if(!player.hasPlayedBefore()){
            player.sendMessage("§aLe patron du casino vous offre §e1 000 jetons §&pour pouvoir commencer a jouer gratuitement. \n §aSi vous perdez touts vos jetons, vous aurez toujours la possibilitée d'en racheter grâce à §6vos pièces§a.");
        }
    }
}
