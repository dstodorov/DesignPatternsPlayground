package observer.event_manager;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
