package com.melville.tom.command;

import java.util.ArrayList;
import java.util.List;

import com.melville.tom.command.steps.ExecuteRequest;
import com.melville.tom.command.steps.Login;

public final class Engine {
    private List<Step> steps = new ArrayList<>();
    private Session session = new MapSession();

    public static void main(String[] args){
        Engine engine = new Engine();
        engine.addTestStep(new Login("administrator", "password"));
        engine.addTestStep(new ExecuteRequest("my/rest/end/point"));
        engine.run();
    }

    public void addTestStep(Step step){
        steps.add(step);
    }

    public void run(){
        for(Step step : steps){
            session = step.execute(session);
        }
    }
}
