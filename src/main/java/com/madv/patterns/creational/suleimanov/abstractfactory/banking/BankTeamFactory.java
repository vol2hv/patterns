package com.madv.patterns.creational.suleimanov.abstractfactory.banking;


import com.madv.patterns.creational.suleimanov.abstractfactory.Developer;
import com.madv.patterns.creational.suleimanov.abstractfactory.ProjectManger;
import com.madv.patterns.creational.suleimanov.abstractfactory.ProjectTeamFactory;
import com.madv.patterns.creational.suleimanov.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
