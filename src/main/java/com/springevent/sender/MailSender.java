package com.springevent.sender;

import com.springevent.CommitCompletedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MailSender {

    @EventListener
    public void send(CommitCompletedEvent event) {
        System.out.println(event.getUserName() + "にメールで通知しました");
    }
}
