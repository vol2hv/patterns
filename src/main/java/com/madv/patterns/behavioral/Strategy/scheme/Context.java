package com.madv.patterns.behavioral.Strategy.scheme;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        strategy.execute();
    }
}
