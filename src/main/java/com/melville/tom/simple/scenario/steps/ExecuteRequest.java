package com.melville.tom.simple.scenario.steps;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Stopwatch;
import com.melville.tom.simple.scenario.MapSession;
import com.melville.tom.simple.scenario.Session;
import com.melville.tom.simple.scenario.Step;
import com.melville.tom.simple.scenario.StepObserver;
import com.melville.tom.simple.scenario.StepSubject;
import com.melville.tom.simple.scenario.tools.HttpRequest;
import com.melville.tom.simple.scenario.tools.Request;
import com.melville.tom.simple.scenario.tools.Tool;

public class ExecuteRequest implements Step, StepSubject {
    private final String resource;
    private final List<StepObserver> observers = new ArrayList<StepObserver>();
    private Stopwatch stopwatch;

    public ExecuteRequest(final String resource){
        this.resource = resource;
    }

    @Override
    public void execute() {
        stopwatch = Stopwatch.createStarted();
        final Session session = MapSession.instance();
        final Tool tool = session.getAttribute("tool");
        final Request request = new HttpRequest(resource);
        tool.execute(request);
        stopwatch.stop();
        notifyObservers();
    }

    @Override
    public void addObserver(final StepObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(final StepObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(final StepObserver observer : observers){
            observer.update(stopwatch);
        }
    }
}
