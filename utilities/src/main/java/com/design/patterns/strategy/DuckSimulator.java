package com.design.patterns.strategy;

public class DuckSimulator {
    public static void run() {
        Duck mallard = new Mallard();
        Duck rubberDucky = new RubberDucky();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        rubberDucky.display();
        rubberDucky.performFly();
        rubberDucky.performQuack();
        rubberDucky.setFlyBehavior(new FlyWithWings());
        rubberDucky.performFly();
    }
}
