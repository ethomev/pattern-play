package com.melville.tom.command.steps;

import com.melville.tom.command.MapSession;
import com.melville.tom.command.Session;
import com.melville.tom.command.Step;
import com.melville.tom.command.tools.HttpRequest;
import com.melville.tom.command.tools.Request;
import com.melville.tom.command.tools.Tool;

public class ExecuteRequest implements Step {
    private final String resource;

    public ExecuteRequest(final String resource){
        this.resource = resource;
    }

    @Override
    public void execute() {
        final Session session = MapSession.instance();
        final Tool tool = session.getAttribute("tool");
        final Request request = new HttpRequest(resource);
        tool.execute(request);
    }
}
