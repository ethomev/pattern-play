package com.melville.tom.simple.scenario.steps;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;
import com.melville.tom.simple.scenario.Step;

public class Logger implements Step {

    private final Step step;

    public Logger(final Step step){
        this.step = step;
    }
    @Override
    public void execute() {
        System.out.println("Step started with arguments: ...");
        Stopwatch watch = Stopwatch.createStarted();
        step.execute();
        watch.stop();
        System.out.println("Step finished. Execution time, in milliseconds, is "+watch.elapsed(TimeUnit.MILLISECONDS));
    }
}
