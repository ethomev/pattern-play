package com.melville.tom.command;

import java.util.HashMap;
import java.util.Map;

public class MapSession implements Session {
    Map<String, Object> attributes = new HashMap<>();
    private static MapSession mapSession = new MapSession();

    private MapSession(){}

    public static MapSession instance(){
        return mapSession;
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
