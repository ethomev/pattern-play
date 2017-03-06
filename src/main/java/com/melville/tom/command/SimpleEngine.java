package com.melville.tom.command;

import java.util.ArrayList;
import java.util.Collection;

import com.melville.tom.command.steps.ExecuteRequest;
import com.melville.tom.command.steps.Logger;
import com.melville.tom.command.steps.Login;
import com.melville.tom.command.steps.Logout;

public final class SimpleEngine implements Engine {
    private Collection<Step> steps = new ArrayList<>();

    public static void main(final String... args){
        final Engine engine = new SimpleEngine();
        engine.addStep(new Login("http://localhost/","administrator", "password"));
        engine.addStep(new ExecuteRequest("my/rest/end/point"));
        engine.addStep(new Logout());
        engine.run();
    }

    @Override
    public void addStep(final Step step){
        steps.add(new Logger(step));
    }

    @Override
    public void run(){
        for(final Step step : steps){
            System.out.println("Executing: "+ step.toString());
            step.execute();
        }
    }
}
