package com.vulkantechnologies.engine.commons.player;

import java.util.UUID;

import lombok.Data;

@Data
public abstract class AbstractGamePlayer implements GamePlayer {

    private final UUID uuid;
    private final String name;

}
