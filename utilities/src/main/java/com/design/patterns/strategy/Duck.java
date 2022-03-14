package com.design.patterns.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    abstract public void display();

    public void fly() {
        flyBehavior.fly();
    }
    public void quack() {
        quackBehavior.quack();
    }

}
