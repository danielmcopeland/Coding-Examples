package com.daugherty;

public class SMSNotification implements INotification {

    private String message;
    private String phoneNumber;

    public SMSNotification(String message, String phoneNumber) {
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        this.sendToPhone(this.phoneNumber, this.message);
    }

    private void sendToPhone(String phoneNumber, String message) {
        /* Code to send SMS text message would go here */
        System.out.println("Sending text message to phone...");
    }

}
