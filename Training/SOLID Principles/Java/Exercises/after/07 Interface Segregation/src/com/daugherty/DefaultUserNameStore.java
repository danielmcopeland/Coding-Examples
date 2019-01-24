package com.daugherty;

public class DefaultUserNameStore implements IUserNameStore {

    @Override
    public String getFirstName() {
        return "John";
    }

    @Override
    public String getMiddleName() {
        return "X.";
    }

    @Override
    public String getLastName() {
        return "Doe";
    }

}
