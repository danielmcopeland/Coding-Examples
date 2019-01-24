package com.daugherty;


public class TemperatureAlertService {

    public boolean checkIsHighTemperature(double temperatureInFahrenheit) {
        double temperatureInCelsius = ((temperatureInFahrenheit - 32) * (5 / 9.0));
        if(temperatureInCelsius > 100) {
            this.sendAlert("Temperature alert " + temperatureInCelsius, "alert.service@example.com");
            return true;
        } else {
            return false;
        }

    }

    public boolean checkIsLowTemperature(double temperatureInFahrenheit) {
        double temperatureInCelsius = ((temperatureInFahrenheit - 32) * (5 / 9.0));
        if(temperatureInCelsius < 0) {
            this.sendAlert("Temperature alert " + temperatureInCelsius, "alert.service@example.com");
            return true;
        } else {
            return false;
        }
    }

    private void sendAlert(String message, String toAddress) {
        // It would use some email service to send the alert
        System.out.println("Sending alert...");
        System.out.println("Message: " + message);
        System.out.println("To Address: " + toAddress);
    }

}
