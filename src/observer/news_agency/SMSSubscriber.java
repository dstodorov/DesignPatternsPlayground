package observer.news_agency;

public class SMSSubscriber implements NewsSubscriber{
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + news);
    }
}

// Androjd Saharov 19
