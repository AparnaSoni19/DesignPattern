package factorypattern;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        switch (channel)
        {
        case "SMS":
            return new SMSNotification();
        case "Email":
             return new EmailNotification();
        case "Push":
                return new PushNotification();
        default:
                throw new IllegalArgumentException("Channel is not supported");
        }
    }
}
