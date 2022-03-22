package com.springevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 観察対象commitサービス.
 */
@Component
public class CommitService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void add() {
        CommitRepository commitRepository = new CommitRepository();
        commitRepository.commit();
        publisher.publishEvent(new CommitCompletedEvent(this,"ユーザー１"));
    }
}
