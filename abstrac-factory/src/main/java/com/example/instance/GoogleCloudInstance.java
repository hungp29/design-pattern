package com.example.instance;

import com.example.storage.Storage;

public class GoogleCloudInstance implements Instance {

    public GoogleCloudInstance(Capacity capacity) {
        System.out.println("Google Cloud Instance created");
    }

    @Override
    public void start() {
        System.out.println("Google Cloud Instance stared");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Cloud Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Cloud Instance stopped");
    }

    @Override
    public String toString() {
        return "Google Cloud Instance";
    }
}
