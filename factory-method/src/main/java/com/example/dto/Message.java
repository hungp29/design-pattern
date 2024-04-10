package com.example.dto;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeader() {
        System.out.println(getContent() + " add default header.");
    }

    public void encrypt() {
        System.out.println(getContent() + " encrypted!");
    }
}
