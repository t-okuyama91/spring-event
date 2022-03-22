package com.springevent.sender;

import com.springevent.CommitCompletedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SlackSender {

    @EventListener
    public void send(CommitCompletedEvent event) {
        System.out.println(event.getUserName() + "にSlackで通知しました");
    }
}
