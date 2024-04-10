package com.example.createtor;

import com.example.dto.Message;
import com.example.dto.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
