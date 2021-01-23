package com.madv.patterns.structural.adapter.DBadapter;
/**
 * Client Interface
 */
public interface Database {
    public void insert();

    public void update();

    public void select();

    public void remove();
}
