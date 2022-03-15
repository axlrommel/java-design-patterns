package com.design.patterns.decorator;

public class StarBuzzCoffee {
    public static void run() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage otherBeverage = new HouseBlend();
        otherBeverage = new Mocha(otherBeverage);
        otherBeverage = new Mocha(otherBeverage); //double mocha
        otherBeverage = new Whip(otherBeverage);
        System.out.println(otherBeverage.getDescription() + " $" + otherBeverage.cost());

    }
}
