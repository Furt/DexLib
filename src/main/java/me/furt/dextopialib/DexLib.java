package me.furt.dextopialib;

import java.io.File;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;

import org.slf4j.Logger;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.config.DefaultConfig;

import com.google.inject.Inject;

@Plugin(id = "DexLib", name = "DextopiaLibrary", version = "0.1")
public class DexLib {
	
	@Inject
	private Logger logger;
	
	public Logger getLogger() {
		return logger;
	}
	
	@Inject
	@DefaultConfig(sharedRoot = false)
	private File defaultConfig;

	@Inject
	@DefaultConfig(sharedRoot = false)
	private ConfigurationLoader<CommentedConfigurationNode> configManager;
	
	@Subscribe
    public void onServerStart(ServerStartedEvent event) {
		getLogger().info("Plugin Enabled.");
	}
	
	@Subscribe
	public void onServerStop(ServerStoppingEvent event) {
		getLogger().info("Plugin Disabled.");
	}
}
