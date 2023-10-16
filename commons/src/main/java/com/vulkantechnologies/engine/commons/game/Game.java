package com.vulkantechnologies.engine.commons.game;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.vulkantechnologies.engine.commons.map.GameMap;
import com.vulkantechnologies.engine.commons.player.GamePlayer;

public interface Game<P extends GamePlayer, M extends GameMap> {

    GameDescription description();

    GameState state();

    void state(@NotNull GameState state);

    @Nullable M map();

    default boolean hasMap() {
        return map() != null;
    }

    void map(@NotNull M map);

}
