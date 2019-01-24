package com.daugherty;


public interface IUserSecurityCredentialsStore {

    public String getPassword();

    public String[] getSecurityQuestionAndAnswer();

}
