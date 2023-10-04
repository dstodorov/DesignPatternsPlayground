package factory.logger_factory;

public class FileLogger implements Logger{

    private final String filename;

    public FileLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(String message) {
        System.out.println("File Log (" + filename + "): " + message);
    }
}
