package com.melville.tom.singleton;

public class Main {

    public static void main(String[] args){
        DbConnection dbConnection = Mine.INSTANCE.getValue();
    }
}
