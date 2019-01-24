package com.daugherty;

public class DataLoader {

    public DataLoader() {

    }

    public String loadData() {
        MySQLDatabaseConnection connection = new MySQLDatabaseConnection();
        return connection.getData();
    }

}
