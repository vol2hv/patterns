package com.madv.patterns.creational.suleimanov.abstractfactory.banking;


import com.madv.patterns.creational.suleimanov.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
