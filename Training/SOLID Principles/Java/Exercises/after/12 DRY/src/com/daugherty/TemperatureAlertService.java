package com.daugherty;


public class TemperatureAlertService {


    // Extracts constant hardcoded values (Strings and numbers) to reusable constants
    public static final String TO_ALERT_EMAIL_ADDRESS = "alert.service@example.com";

    public static final String TEMPERATURE_ALERT_MESSAGE_PREFIX = "Temperature alert ";

    public static final double HIGH_TEMPERATURE_CELSIUS_THRESHOLD = 100;
    public static final double LOW_TEMPERATURE_CELSIUS_THRESHOLD = 0;


    public boolean checkIsHighTemperature(double temperatureInFahrenheit) {
        double temperatureInCelsius = convertToCelsius(temperatureInFahrenheit);
        if(temperatureInCelsius > HIGH_TEMPERATURE_CELSIUS_THRESHOLD) {
            this.sendAlert(TEMPERATURE_ALERT_MESSAGE_PREFIX + temperatureInCelsius, TO_ALERT_EMAIL_ADDRESS);
            return true;
        } else {
            return false;
        }

    }

    public boolean checkIsLowTemperature(double temperatureInFahrenheit) {
        double temperatureInCelsius = (convertToCelsius(temperatureInFahrenheit));
        if(temperatureInCelsius < LOW_TEMPERATURE_CELSIUS_THRESHOLD) {
            this.sendAlert(TEMPERATURE_ALERT_MESSAGE_PREFIX + temperatureInCelsius, TO_ALERT_EMAIL_ADDRESS);
            return true;
        } else {
            return false;
        }
    }

    // Extracts a re-used mathematical operation to its own function
    private double convertToCelsius(double temperatureInFahrenheit) {
        return (temperatureInFahrenheit - 32) * (5 / 9.0);
    }

    private void sendAlert(String message, String toAddress) {
        // It would use some email service to send the alert
        System.out.println("Sending alert...");
        System.out.println("Message: " + message);
        System.out.println("To Address: " + toAddress);
    }

}
