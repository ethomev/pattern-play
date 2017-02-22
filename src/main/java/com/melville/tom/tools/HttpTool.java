package com.melville.tom.tools;

public class HttpTool implements Tool {
    private final String username;
    private final String password;
    private boolean loggedIn = false
            ;

    public HttpTool(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void login() {
        // Take username & password and log into some system.
        // HttpClient from apaceh https://hc.apache.org/
        loggedIn = true;
    }

    @Override
    public void execute(String url) {
        System.out.println("LoggedIn is " + loggedIn);
        System.out.println("Executing "+ url);
    }
}
