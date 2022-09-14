package strategypattern;

public class NotificationService {
    public static void main(String[] args) {
        NotificationStrategy notificationStrategy = new NotificationStrategy();
        notificationStrategy.createNotification(new SMSNotification());
    }
}
