package me.furt.dextopialib;

import org.slf4j.Logger;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

@Plugin(id = "DexLib", name = "DextopiaLibrary", version = "0.1")
public class DexLib {
	
	@Inject
	private Logger logger;
	
	public Logger getLogger() {
		return logger;
	}
	
	@Subscribe
    public void onServerStart(ServerStartedEvent event) {
		getLogger().info("Plugin Enabled.");
	}
	
	@Subscribe
	public void onServerStop(ServerStoppingEvent event) {
		getLogger().info("Plugin Disabled.");
	}
}
