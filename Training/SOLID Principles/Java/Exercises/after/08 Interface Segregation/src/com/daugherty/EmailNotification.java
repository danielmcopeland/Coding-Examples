package com.daugherty;

public class EmailNotification implements INotification {

    private String message;
    private String subject;
    private String emailAddress;

    public EmailNotification(String message, String subject, String emailAddress) {
        this.message = message;
        this.subject = subject;
        this.emailAddress = emailAddress;
    }

    @Override
    public void send() {
        this.sendToEmail(this.emailAddress, this.message, this.subject);
    }

    private void sendToEmail(String emailAddress, String message, String subject) {
        /* Code to send email would go here */
        System.out.println("Sending email...");
    }

}
