package com.melville.tom.command;

import java.util.ArrayList;
import java.util.List;

import com.melville.tom.command.steps.ExecuteRequest;
import com.melville.tom.command.steps.Login;
import com.melville.tom.command.steps.Logout;

public final class Engine {
    private List<Step> steps = new ArrayList<>();

    public static void main(String[] args){
        Engine engine = new Engine();
        engine.addStep(new Login("http://localhost/","administrator", "password"));
        engine.addStep(new ExecuteRequest("my/rest/end/point"));
        engine.addStep(new Logout());
        engine.run();
    }

    public void addStep(Step step){
        steps.add(step);
    }

    public void run(){
        for(Step step : steps){
            System.out.println("Executing: "+ step.toString());
            step.execute();
        }
    }
}
