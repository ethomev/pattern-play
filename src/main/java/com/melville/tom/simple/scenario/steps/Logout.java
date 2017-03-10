package com.melville.tom.simple.scenario.steps;

import com.melville.tom.simple.scenario.MapSession;
import com.melville.tom.simple.scenario.Session;
import com.melville.tom.simple.scenario.Step;
import com.melville.tom.simple.scenario.tools.Tool;

public class Logout implements Step {
    @Override
    public void execute() {
        final Session session = MapSession.instance();
        final Tool tool = session.getAttribute("tool");
        tool.logout();
    }
}
