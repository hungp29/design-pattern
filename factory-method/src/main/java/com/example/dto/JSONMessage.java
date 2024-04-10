package com.example.dto;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON\" :[]}";
    }
}
