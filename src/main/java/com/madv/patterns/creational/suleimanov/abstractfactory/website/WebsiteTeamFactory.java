package com.madv.patterns.creational.suleimanov.abstractfactory.website;

import com.madv.patterns.creational.suleimanov.abstractfactory.Developer;
import com.madv.patterns.creational.suleimanov.abstractfactory.ProjectManger;
import com.madv.patterns.creational.suleimanov.abstractfactory.ProjectTeamFactory;
import com.madv.patterns.creational.suleimanov.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
