package com.daugherty;


public class DefaultHeaderBanner {

    public void displayFullUserName() {

        IUserPreferences defaultUserPreferences = new DefaultUserPreferences();

        String fullUserName =
                defaultUserPreferences.getFirstName() + " " +
                defaultUserPreferences.getMiddleName() + " " +
                defaultUserPreferences.getLastName();

        System.out.println("--------------------------------");
        System.out.println("User --> " + fullUserName);
        System.out.println("--------------------------------");
    }

}
