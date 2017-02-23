package com.melville.tom.command.tools;

public interface Tool {
    void login(String username, String password);
    void execute(Request request);
    void logout();
    void close();
}
