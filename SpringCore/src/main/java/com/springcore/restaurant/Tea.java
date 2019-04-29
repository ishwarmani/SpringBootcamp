package com.springcore.restaurant;

import org.springframework.stereotype.Controller;

@Controller
public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepared Tea!");
    }
}
