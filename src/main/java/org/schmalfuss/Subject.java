package org.schmalfuss;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    abstract Object getState();
}
