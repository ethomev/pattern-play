package com.melville.tom;

import java.util.ArrayList;
import java.util.List;

import com.melville.tom.steps.ExecuteRequest;
import com.melville.tom.steps.Login;

public final class TestStepEngine {
    private List<TestStep> steps = new ArrayList<>();
    private Session session = new MapSession();

    public static void main(String[] args){
        TestStepEngine engine = new TestStepEngine();
        engine.addTestStep(new Login("administrator", "TestPassw0rd"));
        engine.addTestStep(new ExecuteRequest("my/rest/end/point"));
        engine.run();
    }

    public void addTestStep(TestStep testStep){
        steps.add(testStep);
    }

    public void run(){
        for(TestStep testStep : steps){
            session = testStep.execute(session);
        }
    }
}
