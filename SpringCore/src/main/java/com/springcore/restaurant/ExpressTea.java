package com.springcore.restaurant;

public class ExpressTea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared ExpressTea!");
    }
}
