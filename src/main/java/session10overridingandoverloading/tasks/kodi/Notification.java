package session10overridingandoverloading.tasks.kodi;

public class Notification {

  public void displayNotification() {
    System.out.println("Notifications");
  }

  public void displayNotification(String message) {
    System.out.println("Notification: " + message);
  }

  public void displayNotification(String message, String image) {
    System.out.println("Notification: " + message);
    System.out.println("Image Link: " + image);
  }

  public void displayNotification(String name, String message, String image) {
    System.out.println("Name: " + name);
    System.out.println("Notification: " + message);
    System.out.println("Image Link: " + image);
  }
}
