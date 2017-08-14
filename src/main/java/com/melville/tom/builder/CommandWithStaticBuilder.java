package com.melville.tom.builder;

public class CommandWithStaticBuilder {

    private final String attribute;

    private CommandWithStaticBuilder(StaticBuilder builder){
        this.attribute = builder.attribute;

    }

    public static class StaticBuilder {
        private String attribute;

        StaticBuilder setAttribute(String value){
            this.attribute = value;
            return this;
        }

        CommandWithStaticBuilder build(){
            return new CommandWithStaticBuilder(this);
        }
    }
}
