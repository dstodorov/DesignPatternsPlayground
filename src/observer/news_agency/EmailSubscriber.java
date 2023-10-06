package observer.news_agency;

public class EmailSubscriber implements NewsSubscriber{
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending email to: " + this.email + ": " + news);
    }
}
