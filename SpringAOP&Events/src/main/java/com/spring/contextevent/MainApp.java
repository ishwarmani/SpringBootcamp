package com.spring.contextevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        ((ClassPathXmlApplicationContext) applicationContext).start();
        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
        obj.getMessage();
        ((ClassPathXmlApplicationContext) applicationContext).stop();
    }
}
