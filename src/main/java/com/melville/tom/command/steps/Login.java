package com.melville.tom.command.steps;

import com.melville.tom.command.Session;
import com.melville.tom.command.Step;
import com.melville.tom.command.tools.HttpTool;
import com.melville.tom.command.tools.Tool;

public class Login implements Step {

    private final String username;
    private final String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public Session execute(final Session session) {
        System.out.println("Logging into the system");
        Tool tool = new HttpTool(username, password);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        tool.login();
        session.setAttribute("tool", tool);
        return session;
    }
}
