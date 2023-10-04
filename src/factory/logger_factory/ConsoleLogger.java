package factory.logger_factory;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
}
