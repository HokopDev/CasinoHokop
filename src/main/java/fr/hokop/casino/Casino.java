package fr.hokop.casino;

import fr.hokop.casino.managers.EntitiesManager;
import fr.hokop.casino.managers.EventsManager;
import lombok.Getter;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by vgfab on 29/10/2016.
 */
public class Casino extends JavaPlugin{

    @Getter private static Casino instance;
    @Getter private Settings settings;

    @Override
    public void onEnable(){
        instance = this;
        settings = new Settings();

        settings.InitSettings();

        new EntitiesManager(EntityType.ENDERMAN, settings.getLocations()[1], "§aVigile");
        new EventsManager();
    }
}
