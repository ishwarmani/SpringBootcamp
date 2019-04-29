package com.springcore;

import com.springcore.restaurant.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Database database = (Database)applicationContext.getBean("database");
//        System.out.println(database);

//        Restaurant restaurant = (Restaurant) applicationContext.getBean("teaRestaurant");
//        restaurant.getHotDrink().prepareHotDrink();

//        Restaurant restaurant1 = (Restaurant)applicationContext.getBean("expressTeaRestaurant");
//        restaurant1.getHotDrink().prepareHotDrink();

//        Complex complex = (Complex)applicationContext.getBean("complexBean");
//        System.out.println(complex);
//        System.out.println(complex.list);
//        System.out.println(complex.set);
//        System.out.println(complex.map);

        Restaurant restaurant2 = (Restaurant)applicationContext.getBean("restaurant2");
        restaurant2.getHotDrink().prepareHotDrink();

    }
}
