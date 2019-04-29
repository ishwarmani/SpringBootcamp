package com.springcore.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Restaurant {

//    @Autowired
    @Resource
    @Qualifier("expressTea")
    HotDrink hotDrink;

    public Restaurant() {
    }

//    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
