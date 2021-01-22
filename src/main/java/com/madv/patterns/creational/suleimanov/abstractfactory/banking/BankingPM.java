package com.madv.patterns.creational.suleimanov.abstractfactory.banking;

import com.madv.patterns.creational.suleimanov.abstractfactory.ProjectManger;

public class BankingPM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
