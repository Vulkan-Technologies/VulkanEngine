package com.vulkantechnologies.engine.commons.model;

public interface Living {

    boolean isAlive();

    default boolean isDead() {
        return !isAlive();
    }
}
