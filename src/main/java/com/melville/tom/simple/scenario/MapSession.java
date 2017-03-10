package com.melville.tom.simple.scenario;

import java.util.HashMap;
import java.util.Map;

public final class MapSession implements Session {
    private Map<String, Object> attributes = new HashMap<>();
    private static Session session = new MapSession();

    private MapSession(){}

    public static Session instance(){
        return session;
    }

    @Override
    public <T> T getAttribute(final String key) {
        return (T) attributes.get(key);
    }

    @Override
    public <T> void setAttribute(final String key, final T value) {
        attributes.put(key, value);
    }
}
