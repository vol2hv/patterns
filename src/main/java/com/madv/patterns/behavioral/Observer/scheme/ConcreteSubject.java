package com.madv.patterns.behavioral.Observer.scheme;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers ;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void deattach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String s) {
        observers.forEach(observer -> observer.Update(s));
    }
}
