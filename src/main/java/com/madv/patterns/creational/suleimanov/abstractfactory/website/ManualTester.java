package com.madv.patterns.creational.suleimanov.abstractfactory.website;


import com.madv.patterns.creational.suleimanov.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
