package com.melville.tom.command.steps;

import com.melville.tom.command.Session;
import com.melville.tom.command.Step;
import com.melville.tom.command.tools.HttpRequest;
import com.melville.tom.command.tools.Request;
import com.melville.tom.command.tools.Tool;

public class ExecuteRequest implements Step {
    private String resource;

    public ExecuteRequest(String resource){
        this.resource = resource;
    }

    @Override
    public Session execute(final Session session) {
        Tool tool = session.getAttribute("tool");
        Request request = new HttpRequest(resource);
        tool.execute(request);
        return session;
    }
}
