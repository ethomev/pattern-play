package com.melville.tom.factory.abs;

public class AbstractFactory {

    public SpecificFactory create(final String distinguisher){
        if("blah".equalsIgnoreCase(distinguisher)){
            return new Specific1Factory();
        } else if ("feck".equalsIgnoreCase(distinguisher)){
            return new Specific2Factory();
        } else {
            throw new UnsupportedOperationException("Not supported: "+distinguisher);
        }
    }
}
