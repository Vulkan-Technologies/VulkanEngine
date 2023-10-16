package com.vulkantechnologies.engine.commons.player;

import java.util.UUID;

import com.vulkantechnologies.api.model.Nameable;
import com.vulkantechnologies.api.model.Unique;
import com.vulkantechnologies.engine.commons.model.Messageable;

public interface GamePlayer extends Unique<UUID>, Nameable, Messageable {

}
