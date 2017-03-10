package com.melville.tom.simple.scenario.tools;

public class HttpRequest implements Request {

    private final String url;

    public HttpRequest(final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
