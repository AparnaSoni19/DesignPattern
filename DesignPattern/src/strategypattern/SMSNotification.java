package strategypattern;

import factorypattern.Notification;

public class SMSNotification implements Notification, strategypattern.Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notify by SMS");
    }
}
