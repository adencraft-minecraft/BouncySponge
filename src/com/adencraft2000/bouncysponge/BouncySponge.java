package com.adencraft2000.bouncysponge;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.*;
import org.bukkit.configuration.file.*;
import org.bukkit.configuration.serialization.*;
import org.bukkit.configuration.file.FileConfiguration;

public class BouncySponge extends JavaPlugin{

	Logger log;
	
	private final BouncySpongePlayerListener playerListener = new BouncySpongePlayerListener(this);
	private final BouncySpongeEntityListener entityListener = new BouncySpongeEntityListener(this);
	
	/**
	 * Method for when the plugin loads
	 */
	@Override
	public void onLoad() {
		log = getLogger();
	}
	
	/**
	 * Method for when the plugin disables
	 */
	@Override
	public void onDisable() {
		log.info("BouncySponge is disabled!");
	}
	
	/**
	 * Method for when BouncySponge is enabled; Listeners Enabled as well
	 */
	@Override
	public void onEnable() {
		// Registering events
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(playerListener, this);
		pm.registerEvents(entityListener, this);
		this.saveDefaultConfig();
		
		PluginDescriptionFile pdfFile = this.getDescription();
		log.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!");
		log.info("Thanks for using BouncySponge by adencraft2000");
		log.info("http://dev.bukkit.org/server-mods/bouncysponge");
	}

}
