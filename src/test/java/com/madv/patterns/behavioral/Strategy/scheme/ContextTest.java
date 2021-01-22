package com.madv.patterns.behavioral.Strategy.scheme;

import org.junit.jupiter.api.Test;

class ContextTest {
    @Test
    public void test(){
        new Context(new ConcreteStrategyA()).execute();
        new Context(new ConcreteStrategyB()).execute();
    }
}