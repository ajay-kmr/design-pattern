package com.ttn.designpatterns.behavioral.observer;

import java.util.List;

public class SMSSubscriber implements Subscriber {

    // Would actually send a SMS.
    public void update(NewsPublisher publisher) {

        List<String> latestNews = publisher.getLatestNews();
        if (!latestNews.isEmpty()) {

            String mostRecentNews = latestNews.get(latestNews.size() - 1);
            System.out.println("Text messaging most recent news : " + mostRecentNews);
        }
    }
}
