package com.example.resource;

import com.example.instance.GoogleCloudInstance;
import com.example.instance.Instance;
import com.example.storage.GoogleStorage;
import com.example.storage.Storage;

public class GoogleCloudResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleCloudInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new GoogleStorage(capacityInMb);
    }
}
