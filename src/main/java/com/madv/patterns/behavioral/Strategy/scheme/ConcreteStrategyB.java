package com.madv.patterns.behavioral.Strategy.scheme;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void execute() {
        System.out.println("Применен стратегический вариант B");
    }
}
