package com.daugherty;

public class PostgreSQLDatabaseConnection implements IDatabaseConnection {

    public PostgreSQLDatabaseConnection() {
        // A PostgreSQL connection would be established here
    }

    public String getData() {
        // Sample data, hardcoded
        return "-Washington:1789 -Adams:1797 -Jefferson:1801";
    }

}
