package me.JonathanHoffmann.BuddingAmethystChance;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener implements Listener {
    private BuddingAmethystChance plugin;
    private String conf;

    public BlockBreakListener(BuddingAmethystChance pl, String configpath) {
        plugin = pl;
        conf = configpath;
    }

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
                int thresint = plugin.getConfig().getInt(conf);
                double threshold = thresint/100.0;
                //p.sendMessage("Rolled a " + r + ", threshold: " + threshold + ", thresint: " + thresint);
                if (r < threshold)
                {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(),new ItemStack(Material.BUDDING_AMETHYST,1));
                }
            }
        }
    }
}
