package com.melville.tom.builder;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ClassToBuildTest {

    @Test
    public void checkConcurrency() throws InterruptedException, ExecutionException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        List<Future<String>> futures = new ArrayList();
        for(long i=0;i<10000000L;i++){
            BuildCommands buildCommands = new BuildCommands(i);
            futures.add(service.schedule(buildCommands, 1, TimeUnit.MICROSECONDS));
        }

        for(Future<String> future: futures){
            String result = future.get();
            if(result.equalsIgnoreCase("false")) {
                System.out.println(result);
            }
        }
    }

    class BuildCommands implements Callable {

        private final long field;

        BuildCommands(final long field){
            this.field = field;
        }

        @Override
        public String call() throws Exception {
            ClassToBuild classToBuild = new ClassBuilder().setField(field).build();
            String result = ""+(classToBuild.getField() == field);
            return result;

        }
    }
}
