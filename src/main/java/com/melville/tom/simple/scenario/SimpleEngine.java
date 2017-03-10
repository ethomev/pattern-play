package com.melville.tom.simple.scenario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.FluentIterable;
import com.melville.tom.simple.scenario.steps.Logger;
import com.melville.tom.simple.scenario.steps.Login;
import com.melville.tom.simple.scenario.steps.ExecuteRequest;
import com.melville.tom.simple.scenario.steps.Logout;
import com.melville.tom.simple.scenario.tools.TimeKpiObserver;

public final class SimpleEngine implements Engine {
    private Collection<Step> steps = new ArrayList<>();

    public static void main(final String... args){
        final Engine engine = new SimpleEngine();
        engine.addStep(new Login("http://localhost/","administrator", "password"));
        engine.addStep(new ExecuteRequest("my/rest/end/point"));
        engine.addStep(new Logout());
        engine.addObserver(new TimeKpiObserver());
        engine.run();
    }

    @Override
    public void addStep(final Step step){
        steps.add(new Logger(step));
    }

    @Override
    public void addObserver(final StepObserver observer) {
        List<StepSubject> subjects = FluentIterable.from(steps).filter(StepSubject.class).toList();
        for(StepSubject subject: subjects){
            subject.addObserver(observer);
        }
    }

    @Override
    public void run(){
        for(final Step step : steps){
            System.out.println("Executing: "+ step.toString());
            step.execute();
        }
    }
}
