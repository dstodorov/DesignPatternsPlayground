package factory.logger_factory;

public class RemoteLogger implements Logger{
    private final String hostURL;

    public RemoteLogger(String hostURL) {
        this.hostURL = hostURL;
    }

    @Override
    public void log(String message) {
        System.out.printf("Send: %s to the remote host - %s", message, hostURL);
    }
}
