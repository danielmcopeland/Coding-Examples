package com.daugherty;

public class Main {
    public static void main(String[] args) {
        TemperatureAlertService temperatureAlertService = new TemperatureAlertService();
        temperatureAlertService.checkIsHighTemperature(250);
        temperatureAlertService.checkIsLowTemperature(0);
    }
}
