package io.github.zalyson.lobby.plugin;

import io.github.zalyson.lobby.shared.Lobby;
import me.lucko.helper.plugin.ExtendedJavaPlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class LobbyPlugin extends ExtendedJavaPlugin implements Lobby {

    @Override
    protected void enable() {
    }

    @Override
    protected void disable() {
    }

    @Override
    public Plugin getPlugin() {
	   return this;
    }

    @Override
    public PluginManager getPluginManager() {
	   return this.getServer().getPluginManager();
    }
}
