package com.daugherty;

public class DataLoader {

    private IDatabaseConnection databaseConnection;

    /**
     * Constructor
     * @param connection database connection needed to create this object (now an explicit dependency, not tied to a specific database engine)
     */
    public DataLoader(IDatabaseConnection connection) {
        this.databaseConnection = connection;
    }

    public String loadData() {
        return this.databaseConnection.getData();
    }

}
