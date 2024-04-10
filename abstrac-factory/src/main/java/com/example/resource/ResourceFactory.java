package com.example.resource;

import com.example.instance.Instance;
import com.example.storage.Storage;

public interface  ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMb);
}
