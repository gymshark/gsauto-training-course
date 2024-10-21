package session10overridingandoverloading.tasks.akeem;

public class Notification {
    public void displayNotifications() {
        System.out.println("Display notifications");
    }

    public void displayNotifications(String text, String image) {
        System.out.println("Notification: " + text + "\n" + image);
    }

    public void read() {
        System.out.println("Notification read");
    }

    public void delete() {
        System.out.println("Notification deleted");
    }
}
