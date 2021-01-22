package com.madv.patterns.behavioral.Observer.scheme;

public class ConcreteObserver  implements Observer{
    @Override
    public void Update(String s) {
        System.out.println("Получено сообщение: "+s);
    }
}
