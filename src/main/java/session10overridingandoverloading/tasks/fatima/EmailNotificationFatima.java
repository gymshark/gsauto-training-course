package session10overridingandoverloading.tasks.fatima;

public class EmailNotificationFatima extends NotificationFatima {
    @Override
    public void displayNotification(String message) {
        System.out.println("Email Notification: " + message);
    }

    @Override
    public void displayNotification(String message, String imageURL) {
        System.out.println("Email notification: " + message);
        System.out.println("Email image attachment: " + imageURL);
    }

    public void readEmail() {
        System.out.println("Email has been read");
    }

    public void deleteEmail() {
        System.out.println("Email has been deleted");
    }


}
