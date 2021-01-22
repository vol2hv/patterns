package com.madv.patterns.behavioral.Strategy.scheme;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void execute() {
        System.out.println("Применен стратегический вариант A");
    }
}
