package session10overridingandoverloading;

public class MainFatima {
    public static void main(String[] args) {
        NotificationFatima notification = new NotificationFatima();
        EmailNotificationFatima emailNotification = new EmailNotificationFatima();

        notification.displayNotification("First notification");
        notification.displayNotification("Second notification with image", "https://images.app.goo.gl/DwNzvYiBWYEbbF9P7");

        emailNotification.displayNotification("First email notification");
        emailNotification.displayNotification("Second notification with image","https://images.app.goo.gl/DwNzvYiBWYEbbF9P7");

        emailNotification.readEmail();
        emailNotification.deleteEmail();

    }
}
