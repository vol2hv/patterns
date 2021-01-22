package com.madv.patterns.behavioral.Observer.scheme;

public interface Subject {
    void attach(Observer o);
    void deattach(Observer o);
    void notifyObservers(String s);
}
