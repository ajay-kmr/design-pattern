package com.ttn.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsPublisher {

    private static final int THRESHOLD = 10;

    // Maintain the list of observers.
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    private List<String> latestNews = new ArrayList<String>();

    // Attaches an observer.
    public void attachSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Removes an observer.
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void addNews(String news) {

        if (latestNews.size() == THRESHOLD) {
            latestNews = new ArrayList<String>();
        }

        latestNews.add(news);
        notifySubscribers();
    }

    public List<String> getLatestNews() {
        return latestNews;
    }

    // Notify to all subscribers when latest news is updated.
    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }
}
