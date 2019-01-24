package com.daugherty;

public class SMSNotification implements INotification {

    private String message;

    public SMSNotification(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getSubject() {
        /* Not implemented, not applicable */
        return null;
    }

    @Override
    public void sendToEmail(String emailAddress) {
        /* Not implemented, not applicable */
    }

    @Override
    public void sendToPhone(String phoneNumber) {
        /* Code to send SMS text message would go here */
        System.out.println("Sending text message to phone...");
    }

}
