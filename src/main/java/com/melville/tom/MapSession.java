package com.melville.tom;

import java.util.HashMap;
import java.util.Map;

public class MapSession implements Session {
    Map<String, Object> attributes = new HashMap<>();

    @Override
    public <T> T getAttribute(final String key) {
        return (T) attributes.get(key);
    }

    @Override
    public <T> void setAttribute(final String key, final T value) {
        attributes.put(key, value);
    }
}
