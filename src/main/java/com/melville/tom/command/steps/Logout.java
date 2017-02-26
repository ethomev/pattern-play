package com.melville.tom.command.steps;

import com.melville.tom.command.MapSession;
import com.melville.tom.command.Session;
import com.melville.tom.command.Step;
import com.melville.tom.command.tools.Tool;

public class Logout implements Step {
    @Override
    public void execute() {
        Session session = MapSession.instance();
        Tool tool = session.getAttribute("tool");
        tool.logout();
    }
}