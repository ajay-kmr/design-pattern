package com.ttn.designpatterns.behavioral.observer;

import java.util.List;

public class EmailSubscriber implements Subscriber {

    // Would actually send an email.
    public void update(NewsPublisher publisher) {

        List<String> latestNews = publisher.getLatestNews();
        if (!latestNews.isEmpty()) {

            String mostRecentNews = latestNews.get(latestNews.size() - 1);
            System.out.println("Emailing most recent news : " + mostRecentNews);
        }
    }
}
