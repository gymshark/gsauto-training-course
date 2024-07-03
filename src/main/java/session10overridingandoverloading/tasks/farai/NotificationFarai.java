package session10overridingandoverloading.tasks.farai;

public class NotificationFarai {

  public void displayNotification() {
    System.out.println("Displaying basic notification");
  }


  public void displayNotification(String message) {
    System.out.println("Notification: " + message);
  }


  public void displayNotification(String message, String imageUrl) {
    System.out.println("Notification: " + message);
    System.out.println("Image: " + imageUrl);
  }

}
