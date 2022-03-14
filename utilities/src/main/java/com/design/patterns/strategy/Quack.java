package com.design.patterns.strategy;

public class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("quack, quack!");
    }
}
