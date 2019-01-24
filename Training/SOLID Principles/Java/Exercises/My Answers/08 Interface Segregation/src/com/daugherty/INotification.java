package com.daugherty;


public interface INotification {

    public String getMessage();
    public String getSubject();

    public void sendToEmail(String emailAddress);
    public void sendToPhone(String phoneNumber);

}
