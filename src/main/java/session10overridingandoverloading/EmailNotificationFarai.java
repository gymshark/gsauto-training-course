package session10overridingandoverloading;

public class EmailNotificationFarai extends NotificationFarai {

  @Override
  public void displayNotification() {
    System.out.println("Displaying email notification");
  }

  @Override
  public void displayNotification(String message) {
    System.out.println("Summer Sale Email Notification: " + message);
  }

  @Override
  public void displayNotification(String message, String imageUrl) {
    System.out.println("Summer Sale Email Notification: " + message);
    System.out.println("Summer Sale Email Image: " + imageUrl);
  }

  public void isRead(boolean status) {
    System.out.println("Email Notification has been read ? : " + status);
  }

  public void delete() {
    System.out.println("Email notification deleted");
  }
}
