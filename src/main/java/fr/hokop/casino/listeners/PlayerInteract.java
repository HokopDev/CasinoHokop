package fr.hokop.casino.listeners;

import fr.hokop.casino.jeux.MachineAPieces;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by vgfab on 29/10/2016.
 */
public class PlayerInteract implements Listener{

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();

        if(block.getType() == Material.JUKEBOX){
            Arrow arrow = Bukkit.getWorlds().get(0).spawn(new Location(block.getWorld(), (block.getX()+2.5), block.getY(), (block.getZ()+0.5)), Arrow.class);
            arrow.setPassenger(player);

            new MachineAPieces(block);
        }
    }
}
