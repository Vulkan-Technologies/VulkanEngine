package com.vulkantechnologies.engine.commons.game;

import com.vulkantechnologies.api.model.NamespaceKey;

public record GameDescription(NamespaceKey key, String author, String description, int[] version) {

}
