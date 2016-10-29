package fr.hokop.casino;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;

/**
 * Created by vgfab on 29/10/2016.
 */
public class Settings {

    @Getter private Location[] locations;

    /**
     * On initialize des données diverses
     */
    public void InitSettings(){
        locations = new Location[]{new Location(Bukkit.getWorlds().get(0), -83.5, 63.2, -26.5, 0, 0), new Location(Bukkit.getWorlds().get(0), -80.5, 63, -19.5, 180, 0),
                new Location(Bukkit.getWorlds().get(0), -86.5, 63, -19.5, 180, 0)};


    }

}
