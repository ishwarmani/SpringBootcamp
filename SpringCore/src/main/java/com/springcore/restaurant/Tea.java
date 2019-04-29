package com.springcore.restaurant;

public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared Tea!");
    }
}
