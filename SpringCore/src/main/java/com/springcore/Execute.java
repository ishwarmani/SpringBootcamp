package com.springcore;

import com.springcore.restaurant.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Database database = (Database)applicationContext.getBean("database");
        System.out.println(database);

        Restaurant restaurant = (Restaurant) applicationContext.getBean("teaRestaurant");
        restaurant.getHotDrink().prepareHotDrink();

        Restaurant restaurant1 = (Restaurant)applicationContext.getBean("expressTeaRestaurant");
        restaurant1.getHotDrink().prepareHotDrink();

    }
}
