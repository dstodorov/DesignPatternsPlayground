package observer.news_agency;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<NewsSubscriber> subscribers;
    private String news;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    public void addObserver(NewsSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeObserver(NewsSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void setNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for(NewsSubscriber subscriber : this.subscribers) {
            subscriber.update(news);
        }
    }
}
