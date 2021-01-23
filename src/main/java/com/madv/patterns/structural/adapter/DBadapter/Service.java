package com.madv.patterns.structural.adapter.DBadapter;
/**
 * Service работает с чужим интерфейсом
 */
public class Service {
    public void saveObject(){
        System.out.println("Saving Java object...");
    }

    public void updateObject(){
        System.out.println("Updating Java object...");
    }

    public void loadObject(){
        System.out.println("Loading Java object...");
    }

    public void deleteObject(){
        System.out.println("Deleting Java object...");
    }
}
