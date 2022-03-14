package com.design.patterns.strategy;

public class RubberDucky extends Duck{
    public RubberDucky() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    public void display() {
        System.out.println("I am a rubber ducky");
    }
}
