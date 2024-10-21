package session10overridingandoverloading.tasks.akeem;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        EmailNotification emailNotification = new EmailNotification();
        notification.displayNotifications();
        notification.displayNotifications("You have 1 unread messages(s)", "alert.jpg");

        emailNotification.displayNotifications();
        emailNotification.displayNotifications("New Product launched", "gymshark_black_gilet.jpg");
        emailNotification.read();
        emailNotification.delete();
    }
}
