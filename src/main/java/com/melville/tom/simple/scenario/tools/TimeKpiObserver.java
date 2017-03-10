package com.melville.tom.simple.scenario.tools;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;
import com.melville.tom.simple.scenario.StepObserver;

public class TimeKpiObserver implements StepObserver {
    @Override
    public void update(final Stopwatch stopwatch) {
        System.out.println("Sending execution time, "+stopwatch.elapsed(TimeUnit.MILLISECONDS)+"msec, to data base");
    }
}
