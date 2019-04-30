package com.spring.exercise;

import org.springframework.context.ApplicationEvent;

public class ConnectEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ConnectEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "Connect Event Fired";
    }
}
