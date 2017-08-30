package com.melville.tom.singleton;

public enum Mine {
    INSTANCE;

    DbConnection dbConnection = DbConnection.getInstance();

    DbConnection getValue(){
        return dbConnection;
    }
}
