package com.example.createtor;

import com.example.dto.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeader();
        message.encrypt();
        return message;
    }

    public abstract Message createMessage();
}
