package observer.event_manager;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("/home/dev/README.md"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("d.todorov.vn@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
