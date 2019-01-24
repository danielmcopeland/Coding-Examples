package com.daugherty;

public class Main {

    public static void main(String[] args) {
        INotification emailNotification = new EmailNotification("Sample email text", "Sample subject", "example@example.com");
        INotification smsNotification = new SMSNotification("Sample text message", "314-123-4567");

        emailNotification.send();
        smsNotification.send();
    }
}
