package io.github.zalyson.lobby.protection.events;

import io.github.zalyson.lobby.shared.Lobby;
import io.github.zalyson.lobby.events.EventsWrapper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public final class ProtectPlayerEvent extends EventsWrapper implements Listener {

    public ProtectPlayerEvent(final Lobby lobby) {
	   super(lobby);
    }

    @EventHandler
    private void on(final EntityDamageByEntityEvent entityDamageByEntityEvent) {
	   final Entity targetEntity = entityDamageByEntityEvent.getEntity();
	   if (targetEntity instanceof Player)
		  entityDamageByEntityEvent.setCancelled(true);
    }

    @Override
    public void register() {
	   lobby.getPluginManager().registerEvents(this, lobby.getPlugin());
    }
}
