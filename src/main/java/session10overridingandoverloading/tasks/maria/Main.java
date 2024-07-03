package session10overridingandoverloading.tasks.maria;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        EmailNotification emailNotification = new EmailNotification();

        //Using methods from the Notification Class
        notification.displayNotifications();
        notification.displayNotifications("Text only notification");
        notification.displayNotifications("Notification test", "https://.google.com");

        //Using methods from the Email Notification Class
        emailNotification.displayNotifications("Email Notification text", "https://.google.com");
        emailNotification.displayNotifications("Email notification text only ");
        emailNotification.readEmailNotifications("User action - read");
        emailNotification.readEmailNotifications("Email Noticeboards", true);
        emailNotification.deleteEmailNotifications("Deleted email notification text");
        emailNotification.deleteEmailNotifications("Text deleted", 12);
    }
}
