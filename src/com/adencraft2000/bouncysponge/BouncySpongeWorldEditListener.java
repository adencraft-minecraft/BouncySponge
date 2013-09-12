package com.adencraft2000.bouncysponge;

import com.sk89q.worldedit.bukkit.*;
import com.sk89q.worldedit.bukkit.selections.*;
        
import org.bukkit.Bukkit;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.bukkit.configuration.*;
import org.bukkit.configuration.file.*;
import org.bukkit.event.*;

public class BouncySpongeWorldEditListener implements Listener{
	 BouncySponge plugin;{

    WorldEditPlugin worldedit;
		Selection selection = worldedit.getSelection(player);	

    public BouncySpongeWorldEditListener() {
        this.worldedit = (WorldEditPlugin) Bukkit.getServer().getPluginManager().getPlugin("WorldEdit");
    }
}                                



