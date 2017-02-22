package com.melville.tom.steps;

import com.melville.tom.Session;
import com.melville.tom.TestStep;
import com.melville.tom.tools.HttpTool;
import com.melville.tom.tools.Tool;

public class Login implements TestStep {

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
