package com.vulkantechnologies.engine.commons.map;

import java.util.Collection;

import org.jetbrains.annotations.NotNull;

import com.vulkantechnologies.api.model.Nameable;
import com.vulkantechnologies.engine.commons.player.GamePlayer;

public interface GameMap extends Nameable {

    void teleportPlayers(@NotNull Collection<GamePlayer> players);
}
