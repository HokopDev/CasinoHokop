package fr.hokop.casino;

import fr.hokop.casino.managers.EventsManager;
import fr.hokop.casino.managers.PlayersManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by vgfab on 29/10/2016.
 */
public class Casino extends JavaPlugin{

    @Getter private static Casino instance;
    @Getter private Settings settings;
    @Getter private Entities entities;

    @Override
    public void onEnable(){
        instance = this;
        settings = new Settings();
        entities = new Entities();


        settings.InitSettings();
        entities.createEntities();

        new EventsManager();
    }

    @Override
    public void onDisable() {
        PlayersManager.getPlayersList().clear();
    }
}
