package com.melville.tom.command.tools;

public interface Tool {
    void login(String username, String password);
    <T extends Request> void execute(T request);
    void logout();
    void close();
}
