package com.melville.tom.builder;

public class ClassBuilder {
    private long field;

    public ClassBuilder setField(final long field){
        this.field = field;
        return this;
    }

    public ClassToBuild build(){
        return new ClassToBuild(field);
    }
}
