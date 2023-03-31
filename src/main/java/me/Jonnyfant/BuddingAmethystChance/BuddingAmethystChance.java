package me.Jonnyfant.BuddingAmethystChance;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

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
