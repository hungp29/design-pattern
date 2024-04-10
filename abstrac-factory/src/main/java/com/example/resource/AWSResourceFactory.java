package com.example.resource;

import com.example.instance.EC2Instance;
import com.example.instance.Instance;
import com.example.storage.S3Storage;
import com.example.storage.Storage;

public class AWSResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
}
