package com.madv.patterns.creational.suleimanov.abstractfactory.website;


import com.madv.patterns.creational.suleimanov.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
