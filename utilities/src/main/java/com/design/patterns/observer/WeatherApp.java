package com.design.patterns.observer;

public class WeatherApp {
    public static void run() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentConditions);
        weatherData.setMeasurements(10.0f, 20.0f, 4.5f);
        currentConditions.display();
        weatherData.setMeasurements(11.0f, 21.0f, 4.6f);
        currentConditions.display();
    }
}
