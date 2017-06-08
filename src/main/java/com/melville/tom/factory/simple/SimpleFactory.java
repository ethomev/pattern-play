package com.melville.tom.factory.simple;

public class SimpleFactory {

    public Shell createShell(ShellType shellType){
        if(shellType.equals(ShellType.BASH)){
            return new BashShell();
        } else if(shellType.equals(ShellType.CSH)){
            return new CshShell();
        } else {
            throw new UnsupportedOperationException("Unsupported shell type, "+shellType);
        }
    }
}
