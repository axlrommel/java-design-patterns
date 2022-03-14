package com.design.patterns.strategy;

public class Mallard extends Duck {
    public Mallard() {
        flyBehavior = new FlyWithWings(); 
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a mallard duck");
    }
}
