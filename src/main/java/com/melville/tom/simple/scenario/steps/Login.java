package com.melville.tom.simple.scenario.steps;

import com.melville.tom.simple.scenario.Session;
import com.melville.tom.simple.scenario.MapSession;
import com.melville.tom.simple.scenario.Step;
import com.melville.tom.simple.scenario.tools.HttpTool;
import com.melville.tom.simple.scenario.tools.Tool;

public class Login implements Step {

    private final String username;
    private final String password;
    private String url;

    public Login(final String url, final String username, final String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }
    @Override
    public void execute() {
        final Session session = MapSession.instance();
        final Tool tool = new HttpTool(url);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        tool.login(username, password);
        session.setAttribute("tool", tool);
    }
}
