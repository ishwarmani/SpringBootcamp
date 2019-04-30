package com.spring.exercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Database implements ApplicationEventPublisherAware {

    @Value("3306")
    private int port;
    @Value("MYSQL")
    private String name;

    private ApplicationEventPublisher eventPublisher;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect(){
        System.out.println("Connecting to mysql...");
        ConnectEvent connectEvent = new ConnectEvent(this);
        eventPublisher.publishEvent(connectEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        eventPublisher = applicationEventPublisher;
    }
}
