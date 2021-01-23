package com.madv.patterns.structural.adapter.DBadapter;

public class Client {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase(new Service());

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
