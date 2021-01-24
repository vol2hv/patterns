package com.madv.patterns.structural.composite.teams;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@ToString
public class Team  implements Teamlable{
    private String name;
    private List<Teamlable> members = new ArrayList<Teamlable>();
    public Team(String name) {
        this.name = name;
    }

    public void add(Teamlable member){
        members.add(member);
    }

    public void remove(Teamlable member){
        members.remove(member);
    }
    @Override
    public void info() {
        System.out.printf("\nTeam name: %s salary: %d\n",name,getSalary());
        members.forEach(c->c.info());
//        System.out.println("\n\n");
    }
    @Override
    public int getSalary(){
        int s =0;
        for (Teamlable m: members) {
            s += m.getSalary();
        }
        return s;
    }
}
