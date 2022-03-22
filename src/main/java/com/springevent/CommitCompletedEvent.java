package com.springevent;

import org.springframework.context.ApplicationEvent;

public class CommitCompletedEvent extends ApplicationEvent {
    private final String userName;

    public CommitCompletedEvent(Object source,String userName) {
        super(source);
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }
}