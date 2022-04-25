package io.github.zalyson.lobby.protection.events;

import io.github.zalyson.lobby.shared.Lobby;
import io.github.zalyson.lobby.events.EventsWrapper;
import org.bukkit.event.Listener;

public class PreventBuildingEvent extends EventsWrapper implements Listener {

    protected PreventBuildingEvent(Lobby lobby) {
	   super(lobby);
    }

    @Override
    public void register() {

    }
}
