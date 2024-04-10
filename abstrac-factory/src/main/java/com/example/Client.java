package com.example;

import com.example.instance.Instance;
import com.example.resource.AWSResourceFactory;
import com.example.resource.GoogleCloudResourceFactory;
import com.example.resource.ResourceFactory;
import com.example.storage.Storage;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageInMb) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageInMb);

        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client clientAWS = new Client(new AWSResourceFactory());
        Instance aws = clientAWS.createServer(Instance.Capacity.large, 1000);
        aws.start();
        aws.stop();

        System.out.println("---------------");
        Client clientGG = new Client(new GoogleCloudResourceFactory());
        Instance gg = clientGG.createServer(Instance.Capacity.small, 100);
        gg.start();
        gg.stop();
    }
}
