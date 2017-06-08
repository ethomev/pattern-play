package com.melville.tom.simple.scenario;

import java.util.ArrayList;
import java.util.Collection;

import com.melville.tom.builder.ClassBuilder;
import com.melville.tom.builder.ClassToBuild;
import com.melville.tom.builder.Command;
import com.melville.tom.builder.CommandBuilder;
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

        Command command = new Command(new CommandBuilder());
    }

    @Override
    public void addStep(final Step step){
        steps.add(new Logger(step));
    }

    @Override
    public void addObserver(final StepObserver observer) {
        for(Step subject: steps){
            //FIXME Struggling to add observers to step implementations that also implement StepSubject
            //Step & StepSubject are 2 separate interfaces which the class implements, StepSubject is not assignable from or an instance of Step
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
