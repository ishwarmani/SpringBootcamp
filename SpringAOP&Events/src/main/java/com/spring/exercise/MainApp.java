package com.spring.exercise;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.start();
        Database database = (Database) context.getBean("database");
        database.connect();
        System.out.println(database.getName());
        System.out.println(database.getPort());
        context.stop();
        context.close();
    }
}
