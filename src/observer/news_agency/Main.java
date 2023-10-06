package observer.news_agency;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsSubscriber emailSubscriber = new EmailSubscriber("d.todorov.vn@gmail.com");
        NewsSubscriber smsSubscriber = new SMSSubscriber("+012 345-678-90");

        newsAgency.addObserver(emailSubscriber);
        newsAgency.addObserver(smsSubscriber);

        newsAgency.setNews("Hello world! The where will be great today!");

        newsAgency.removeObserver(smsSubscriber);

        newsAgency.setNews("Hello world! The where will be great today!");

    }
}
