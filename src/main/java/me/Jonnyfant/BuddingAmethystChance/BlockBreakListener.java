package me.Jonnyfant.BuddingAmethystChance;

import java.util.Random;

import javax.crypto.spec.RC2ParameterSpec;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        //https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/block/BlockBreakEvent.html
        if(event.getBlock().getType().equals(Material.BUDDING_AMETHYST))
        {
            Player p = event.getPlayer();
            if(p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH))
            {
                Random random = new Random();
                double r = random.nextDouble();
                if (r < 0.1)
                {
                    event.getBlock().
                }
            }
        }
    }
}
