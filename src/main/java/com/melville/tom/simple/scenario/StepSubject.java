package com.melville.tom.simple.scenario;

public interface StepSubject {
    void addObserver(StepObserver observer);
    void removeObserver(StepObserver observer);
    void notifyObservers();
}
