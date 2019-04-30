package com.spring.exercise;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ConnectEventListener implements ApplicationListener<ConnectEvent> {
    @Override
    public void onApplicationEvent(ConnectEvent event) {
        System.out.println(event.toString());
    }
}
