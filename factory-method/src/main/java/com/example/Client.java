package com.example;

import com.example.createtor.JSONMessageCreator;
import com.example.createtor.MessageCreator;
import com.example.createtor.TextMessageCreator;
import com.example.dto.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.getMessage();
        System.out.println(msg);
    }
}
