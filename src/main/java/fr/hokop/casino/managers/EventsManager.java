package fr.hokop.casino.managers;

import fr.hokop.casino.Casino;
import fr.hokop.casino.listeners.PlayerInteract;
import fr.hokop.casino.listeners.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

/**
 * Created by vgfab on 29/10/2016.
 */
public class EventsManager{

    /**
     * Register events
     */
    public EventsManager(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoin(), Casino.getInstance());
        pluginManager.registerEvents(new PlayerInteract(), Casino.getInstance());
    }
}
