package com.daugherty;

public class Main {

    public static void main(String[] args) {
        IDatabaseConnection postgreSQLDatabaseConnection = new PostgreSQLDatabaseConnection();
        DataLoader dataLoader = new DataLoader(postgreSQLDatabaseConnection);
        String loadedData = dataLoader.loadData();
        System.out.println("Data loaded: " + loadedData);
    }
}
