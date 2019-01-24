package com.daugherty;

public class DefaultUserPreferences implements IUserPreferences {

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

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String[] getSecurityQuestionAndAnswer() {
        return new String[0];
    }

    @Override
    public String getFavoriteURL() {
        return null;
    }

    @Override
    public String[] getBookmarkList() {
        return new String[0];
    }
}
