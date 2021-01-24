package com.madv.patterns.structural.composite.teams;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Developer implements Teamlable {
    private String name;
    private String role;
    private int salary;

    public Developer(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public void info() {
        System.out.printf("name: %s role: %s salary: %d \n",name, role, salary);
    }
    @Override
    public int getSalary(){
        return salary;
    }
}
