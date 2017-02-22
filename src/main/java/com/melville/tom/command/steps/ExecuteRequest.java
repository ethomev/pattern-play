package com.melville.tom.command.steps;

import com.melville.tom.command.Session;
import com.melville.tom.command.TestStep;
import com.melville.tom.command.tools.Tool;

public class ExecuteRequest implements TestStep {
    private String url;

    public ExecuteRequest(String url){
        this.url = url;
    }

    @Override
    public Session execute(final Session session) {
        Tool tool = session.getAttribute("tool");
        tool.execute(url);
        return session;
    }
}
