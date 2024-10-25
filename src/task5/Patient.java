package task5;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private List<String> notifications;

    public Patient(String name) {
        this.name = name;
        this.notifications = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addNotification(String notification) {
        notifications.add(notification);
    }

    public List<String> getNotifications() {
        return notifications;
    }
}
