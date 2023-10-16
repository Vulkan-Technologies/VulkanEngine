package com.vulkantechnologies.engine.commons.winning;

import java.util.Optional;

import com.vulkantechnologies.engine.commons.game.Game;
import com.vulkantechnologies.engine.commons.map.GameMap;
import com.vulkantechnologies.engine.commons.player.GamePlayer;

public interface WinningCondition<P extends GamePlayer, M extends GameMap, G extends Game<P, M>> {

    boolean shouldStop(G game);

    Optional<P> winner(G game);
}
