package com.daugherty;

public class EmailNotification implements INotification {

    private String message;
    private String subject;

    public EmailNotification(String message, String subject) {
        this.message = message;
        this.subject = subject;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void sendToEmail(String emailAddress) {
        /* Code to send email would go here */
        System.out.println("Sending email...");
    }

    @Override
    public void sendToPhone(String phoneNumber) {
        /* Not implemented, not applicable */
    }

}
