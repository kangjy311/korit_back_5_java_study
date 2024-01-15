package com.study.test01;

public class Factory {
    private String factoryName;
    private static Factory instance;

    private Factory() {

    }

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }
}
