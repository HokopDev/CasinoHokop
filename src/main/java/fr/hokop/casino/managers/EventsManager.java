package fr.hokop.casino.managers;

import fr.hokop.casino.Casino;
import fr.hokop.casino.listeners.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

/**
 * Created by vgfab on 29/10/2016.
 */
public class EventsManager{

    /**
     * On enregistre les events
     */
    public EventsManager(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoin(), Casino.getInstance());
    }
}
