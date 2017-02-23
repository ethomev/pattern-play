package com.melville.tom.command.tools;

import java.io.IOException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpTool implements Tool {
    private String username;
    private String password;
    private final String url;
    private boolean loggedIn = false;
    private CloseableHttpClient httpClient;

    public HttpTool(final String url) {
        this.url = url;
    }

    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        // Take username & password and log into some system.
        // HttpClient from apache https://hc.apache.org/
        httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url+"/login");
        loggedIn = true;
    }

    @Override
    public void execute(Request request) {
        System.out.println("LoggedIn is " + loggedIn);
        System.out.println("Executing "+ url);
    }

    @Override
    public void logout() {
        loggedIn = false;
    }

    @Override
    public void close() {
        try {
            httpClient.close();
        } catch (IOException e) {
            System.out.println("Something went wrong when closing the tool");
            System.out.println(e);
        }
    }
}
