package com.melville.tom.simple.scenario;

public interface Engine {
    void addStep(Step step);
    void addObserver(StepObserver observer);

    void run();
}
