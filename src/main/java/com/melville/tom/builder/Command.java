package com.melville.tom.builder;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private String shell;
    private String command;
    private List<String> flags = new ArrayList<>();
    private List<String> args;

    public Command(final CommandBuilder commandBuilder) {
        this.shell = commandBuilder.shell;
        this.command = commandBuilder.command;
        this.flags = commandBuilder.flags;
        this.args = commandBuilder.args;
    }
}
