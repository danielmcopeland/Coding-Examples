package com.daugherty;

public interface IUserPreferences {

    public String getFirstName();

    public String getMiddleName();

    public String getLastName();

    public String getPassword();

    public String[] getSecurityQuestionAndAnswer();

    public String getFavoriteURL();

    public String[] getBookmarkList();

}
