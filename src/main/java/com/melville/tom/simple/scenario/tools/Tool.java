package com.melville.tom.simple.scenario.tools;

public interface Tool {
    void login(String username, String password);
    <T extends Request> void execute(T request);
    void logout();
    void close();
}
