package com.daugherty;


public class DefaultHeaderBanner {

    public void displayFullUserName() {

        IUserNameStore defaultUserNameStore = new DefaultUserNameStore();

        String fullUserName =
                defaultUserNameStore.getFirstName() + " " +
                defaultUserNameStore.getMiddleName() + " " +
                defaultUserNameStore.getLastName();

        System.out.println("--------------------------------");
        System.out.println("User --> " + fullUserName);
        System.out.println("--------------------------------");
    }

}
