package session10overridingandoverloading.tasks.fatima;

public class NotificationFatima {

    public void displayNotification(String message) {
        System.out.println("Notification: " + message);
    }

    public void displayNotification( String message, String imageURL) {
        System.out.println("Notification: " + message);
        System.out.println("Notification: " + imageURL);
    }
}
