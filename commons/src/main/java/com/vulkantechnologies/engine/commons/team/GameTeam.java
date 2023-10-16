package com.vulkantechnologies.engine.commons.team;

import java.util.Collection;

import org.jetbrains.annotations.Nullable;

import com.vulkantechnologies.engine.commons.player.GamePlayer;

public interface GameTeam<P extends GamePlayer> extends GamePlayer {

    int size();

    @Nullable P leader();

    void setLeader(P leader);

    Collection<P> members();
}
