package com.springcore.restaurant;

import org.springframework.stereotype.Repository;

@Repository
public class ExpressTea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared ExpressTea!");
    }
}
