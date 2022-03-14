package com.design.patterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Measurements measurements;
    @Override
    public void display() {
        System.out.println("Temperature: " + measurements.temperature + "\nHumidity: " + measurements.humidity + "\nPressure: " + measurements.pressure );
    }

    @Override
    public void update(Measurements m) {
        measurements = m;
    }
}
