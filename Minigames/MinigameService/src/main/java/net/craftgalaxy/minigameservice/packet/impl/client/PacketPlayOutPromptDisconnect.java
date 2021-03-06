package net.craftgalaxy.minigameservice.packet.impl.client;

import net.craftgalaxy.minigameservice.packet.MinigamePacketPlayOut;

import java.io.Serializable;

public class PacketPlayOutPromptDisconnect implements MinigamePacketPlayOut, Serializable {

	private static final long serialVersionUID = -1842918742382356296L;
	private final boolean shutdown;

	public PacketPlayOutPromptDisconnect(boolean shutdown) {
		this.shutdown = shutdown;
	}

	public boolean isShutdown() {
		return this.shutdown;
	}
}
