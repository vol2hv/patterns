package com.madv.patterns.structural.composite.teams;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Client {
    public static void main(String[] args) {
        Team team = new Team("Первая");
        team.add(new Developer("Ivanov","java developer",1200));
        team.add(new Developer("Petrov","c++ developer",1300));

        Team team1 = new Team("Small");
        team1.add(new Developer("Chuk","java developer",1000));
        team1.add(new Developer("Gek","c++ developer",1100));
        team1.add(new Developer("Gunka","c++ developer",2000));
        team.add(team1);
//        System.out.println(team.toString());
        team.info();
//        log.info("строка {} число {}", "qqq", 123.99);

    }
}
