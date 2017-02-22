package com.melville.tom;

public interface Session {
    <T> T getAttribute(String key);
    <T> void setAttribute(String key, T value);
}
