package com.madv.patterns.structural.adapter.DBadapter;
/**
 * Adapter
 */
public class AdapterJavaToDatabase implements Database {
    private Service service;

    public AdapterJavaToDatabase(Service service) {
        this.service = service;
    }

    @Override
    public void insert() {
        service.saveObject();
    }

    @Override
    public void update() {
        service.updateObject();
    }

    @Override
    public void select() {
        service.loadObject();
    }

    @Override
    public void remove() {
        service.deleteObject();
    }
}
