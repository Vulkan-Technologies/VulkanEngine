package com.vulkantechnologies.engine.commons.model;

import com.vulkantechnologies.api.i18n.Message;

import net.kyori.adventure.title.Title;

public interface Messageable {

    void message(Message message, Object... placeholders);

    void actionBar(Message message, Object... placeholders);

    void title(Message title, Message subTitle, Object... placeholders);

    void title(Message title, Message subTitle, Title.Times times, Object... placeholders);

}