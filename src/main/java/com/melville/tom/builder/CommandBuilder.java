package com.melville.tom.builder;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder {
    protected String shell;
    protected String command;
    protected List<String> flags = new ArrayList<>();
    protected List<String> args = new ArrayList<>();

    public CommandBuilder setShell(final String shell){
        this.shell = shell;
        return this;
    }

    public CommandBuilder setCommand(final String command){
        this.command = command;
        return this;
    }

    public CommandBuilder addFlag(final String flag){
        this.flags.add(flag);
        return this;
    }

    public CommandBuilder addArg(final String arg){
        this.args.add(arg);
        return this;
    }

    public Command build(){
        return new Command(this);
    }
}
