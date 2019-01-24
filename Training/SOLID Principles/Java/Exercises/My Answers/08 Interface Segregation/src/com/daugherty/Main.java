package com.daugherty;

public class Main {

    public static void main(String[] args) {
        INotification emailNotification = new EmailNotification("Sample email text", "Sample subject");
        INotification smsNotification = new SMSNotification("Sample text message");

        emailNotification.sendToEmail("example@example.com");
        smsNotification.sendToPhone("314-123-4567");

    }
}
