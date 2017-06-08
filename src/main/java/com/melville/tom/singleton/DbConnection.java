package com.melville.tom.singleton;

public final class DbConnection {

    // Eager Instantiation
    private static DbConnection dbConnection = new DbConnection();

    private DbConnection() {
    }

    // get over concurrency issues
    public static synchronized DbConnection getInstance(){
        // Lazy Instantiation
        if(dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }
}
