package fr.hokop.casino.managers;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import java.util.HashMap;

/**
 * Created by vgfab on 29/10/2016.
 */
public class EntitiesManager {

    @Getter private HashMap<Entity, EntitiesManager> entitiesList = new HashMap<>();
    private Entity entity;
    private Location location;
    private String string;

    /**
     * constructor for create and stock custom entity
     *
     * @param entityType    initialization: her typ
     * @param location      initialization: her spawn point
     * @param string        initialization: her name;
     */
    public EntitiesManager(EntityType entityType, Location location, String string){
        this.location = location;

        this.entity = Bukkit.getWorlds().get(0).spawnEntity(location, entityType);
        this.entity.setCustomNameVisible(true);
        this.entity.setCustomName(string);

        entitiesList.put(this.entity , this);
    }
}
