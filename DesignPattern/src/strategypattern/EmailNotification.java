package strategypattern;

import factorypattern.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notify by Email");
    }
}
