package session10overridingandoverloading.tasks.kodi;

public class EmailNotification extends Notification {

  @Override
  public void displayNotification() {
    System.out.println("Email notifications");
  }

  @Override
  public void displayNotification(String message) {
    System.out.println("Email notification: " + message);
  }

  @Override
  public void displayNotification(String message, String image) {
    System.out.println("Email notification: " + message);
    System.out.println("Image notification: " + image);
  }

  @Override
  public void displayNotification(String name, String message, String image) {
    System.out.println("Email notification: " + name);
    System.out.println("Email notification: " + message);
    System.out.println("Image notification: " + image);
  }

  public void isEmailRead(boolean read) {
    if (!read) {
      System.out.println("** Email has not been read :( **");
    } else System.out.println("** Email has been read :) **");
  }

  public void deleteEmail() {
    System.out.println("Email notification deleted");
  }
}
