package com.madv.patterns.structural.decorator.devdecoder;
/**
 * Concrete Decorator
 */
public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
