package fr.hokop.casino;

import fr.hokop.casino.managers.EntitiesManager;
import org.bukkit.entity.EntityType;

/**
 * Created by vgfab on 29/10/2016.
 */
public class Entities {

    private EntitiesManager entitiesManager;

    public void createEntities(){
        new EntitiesManager(EntityType.ENDERMAN, Casino.getInstance().getSettings().getLocations()[1], "§a[VIGILE] Robert");
        new EntitiesManager(EntityType.ENDERMAN, Casino.getInstance().getSettings().getLocations()[2], "§a[VIGILE] Bernard");
    }
}
