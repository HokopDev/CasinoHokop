package fr.hokop.casino.jeux;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

/**
 * Created by vgfab on 29/10/2016.
 */
public class MachineAPieces {

    private Block block;
    private Location[] locations;
    @Getter private HashMap<Block, MachineAPieces> machinesList = new HashMap<>();
    @Getter private HashMap<Location[], MachineAPieces> itemFrameList = new HashMap<>();

    public MachineAPieces(Block block){
        this.block = block;

        machinesList.put(block, this);
        createMachine();
        startGame();
    }
    public void createMachine(){
        Location itemFrame1 = new Location(this.block.getWorld(), this.block.getLocation().getBlockX()+1, this.block.getLocation().getBlockY()+1, this.block.getLocation().getBlockZ()-1);
        Location itemFrame2 = new Location(this.block.getWorld(), this.block.getLocation().getBlockX()+1, this.block.getLocation().getBlockY()+1, this.block.getLocation().getBlockZ());
        Location itemFrame3 = new Location(this.block.getWorld(), this.block.getLocation().getBlockX()+1, this.block.getLocation().getBlockY()+1, this.block.getLocation().getBlockZ()+1);

        itemFrameList.put(locations = new Location[]{itemFrame1, itemFrame2, itemFrame3}, this);
    }

    public void startGame(){
        ItemFrame itemFrame;
        for(int i = 0; i < locations.length; i++) {
            itemFrame = (ItemFrame) this.block.getWorld().getBlockAt(locations[i]);
            itemFrame.setItem(new ItemStack(Material.ANVIL));
        }


    }
}
