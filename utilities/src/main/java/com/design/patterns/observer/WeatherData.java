package com.design.patterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private Measurements measurements;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(measurements);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        measurements = new Measurements(temperature, humidity, pressure);
        measurementsChanged();
    }
}
