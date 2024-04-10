package com.example.instance;

import com.example.storage.Storage;

public interface Instance {

    enum Capacity {micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
