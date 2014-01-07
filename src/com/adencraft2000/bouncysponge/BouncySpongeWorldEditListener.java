package com.adencraft2000.bouncysponge;

import com.sk89q.worldedit.Location;
import com.sk89q.worldedit.bukkit.*;
import com.sk89q.worldedit.bukkit.selections.*;
import com.sk89q.worldedit.foundation.World;
        
import org.bukkit.Bukkit;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.bukkit.configuration.*;
import org.bukkit.configuration.file.*;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class BouncySpongeWorldEditListener implements Listener{
	 BouncySponge plugin;
    private final WorldEditPlugin worldedit;
{

    WorldEditPlugin worldedit = null;
        Player player = null;
		Selection selection = worldedit.getSelection(player);	
        this.worldedit = (WorldEditPlugin) Bukkit.getServer().getPluginManager().getPlugin("WorldEdit");
 if (selection != null) {
    World world = (World) selection.getWorld();
        org.bukkit.Location min = selection.getMinimumPoint();
        org.bukkit.Location max = selection.getMaximumPoint(); 
 } 
 
    // Do something with min/max //
if (org.bukkit.cmd.getName().equalsIgnoreCase("cbjh")) {
      if (player.isOp() || player.hasPermission("bouncysponge.cbjh"))
  
          
    // "CBJH" means "Change Block Height" //    
    
    // No selection available //
 
