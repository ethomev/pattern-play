package com.melville.tom.command;

public interface Session {
    <T> T getAttribute(String key);
    <T> void setAttribute(String key, T value);
}
