package com.example.storage;

public class GoogleStorage implements Storage {

    public GoogleStorage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on Google Storage");
    }

    @Override
    public String getId() {
        return "GG";
    }

    @Override
    public String toString() {
        return "Google Storage";
    }
}
