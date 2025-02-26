package me.JonathanHoffmann.BuddingAmethystChance;

import org.bukkit.plugin.java.JavaPlugin;

public class BuddingAmethystChance extends JavaPlugin {
    String configpath = "chance%";

    @Override
    public void onEnable() {
        loadConfig();
        getServer().getPluginManager().registerEvents(new BlockBreakListener(this, configpath), this);
    }

    public void loadConfig() {
        getConfig().addDefault(configpath, 10);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
