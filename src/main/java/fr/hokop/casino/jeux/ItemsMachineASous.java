package fr.hokop.casino.jeux;

import lombok.Getter;
import org.bukkit.Material;

/**
 * Created by vgfab on 29/10/2016.
 */
public enum ItemsMachineASous {

    APPLE(Material.APPLE, (byte)0),
    STAR(Material.NETHER_STAR, (byte)0),
    EMERALD(Material.EMERALD, (byte)0),
    COAL(Material.COAL, (byte)0),
    DIAMOND(Material.DIAMOND, (byte)0),
    OR(Material.GOLD_INGOT, (byte)0),
    REDSTONE(Material.REDSTONE, (byte)0),
    IRON(Material.IRON_INGOT, (byte)0),
    QUARTZ(Material.QUARTZ, (byte)0),
    APPLEOR(Material.GOLDEN_APPLE, (byte)1);

    @Getter private Material material;
    @Getter private Byte data;

    ItemsMachineASous(Material material, Byte data){
        this.material = material;
        this.data = data;
    }
}
