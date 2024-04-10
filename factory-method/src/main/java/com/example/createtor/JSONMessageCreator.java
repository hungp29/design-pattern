package com.example.createtor;

import com.example.dto.JSONMessage;
import com.example.dto.Message;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
