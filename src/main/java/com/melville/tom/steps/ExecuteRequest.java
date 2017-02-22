package com.melville.tom.steps;

import com.melville.tom.Session;
import com.melville.tom.TestStep;
import com.melville.tom.tools.Tool;

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
