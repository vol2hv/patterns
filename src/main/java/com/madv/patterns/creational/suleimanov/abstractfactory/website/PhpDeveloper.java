package com.madv.patterns.creational.suleimanov.abstractfactory.website;


import com.madv.patterns.creational.suleimanov.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
