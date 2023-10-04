package factory.logger_factory;

public class FileLoggerFactory implements LoggerFactory{

    private final String filename;

    public FileLoggerFactory(String filename) {
        this.filename = filename;
    }

    @Override
    public Logger createLogger() {
        return new FileLogger(filename);
    }
}
