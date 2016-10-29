package fr.hokop.casino.managers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

/**
 * Created by vgfab on 29/10/2016.
 */
public class EntitiesManager {

    private Entity entity;
    private Location location;
    private String string;

    /**
     * Constructeur pour créer une entity custom
     *
     * @param entityType    On définit son type
     * @param location      On définit son point de spawn
     * @param string        On définit son nom
     */
    public EntitiesManager(EntityType entityType, Location location, String string){
        this.location = location;

        this.entity = Bukkit.getWorlds().get(0).spawnEntity(location, entityType);
        this.entity.setCustomNameVisible(true);
        this.entity.setCustomName(string);
        disableAI(entity, true);
    }

    /* A REVOIR CAR NE MARCHE PAS */
    private void disableAI(Entity entity, Boolean b){
        LivingEntity livingEntity;
        livingEntity = (LivingEntity) entity;
        ((LivingEntity) entity).setAI(b);
    }
}
