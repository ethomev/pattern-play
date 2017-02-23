package com.melville.tom.command.steps;

import com.melville.tom.command.Session;
import com.melville.tom.command.Step;
import com.melville.tom.command.tools.HttpTool;
import com.melville.tom.command.tools.Tool;

public class Login implements Step {

    private final String username;
    private final String password;
    private String url;

    public Login(String url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }
    @Override
    public Session execute(final Session session) {
        Tool tool = new HttpTool(url);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        tool.login(username, password);
        session.setAttribute("tool", tool);
        return session;
    }
}
