package io.github.zalyson.lobby.events;

import io.github.zalyson.lobby.shared.Lobby;

public abstract class EventsWrapper {

    public final Lobby lobby;

    protected EventsWrapper(Lobby lobby) {
	   this.lobby = lobby;
    }

    public abstract void register();

}
