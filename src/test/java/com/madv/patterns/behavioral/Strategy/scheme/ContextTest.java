package com.madv.patterns.behavioral.Strategy.scheme;

import org.junit.jupiter.api.Test;

class ContextTest {
    @Test
    public void test(){
        Context context = new Context(new ConcreteStrategyA());
        context.execute();
        context.setSrategy(new ConcreteStrategyB());
        context.execute();
    }
}