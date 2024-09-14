package session10overridingandoverloading.tasks.akshatha;

public class EmailNotification extends Notification {

  @Override
  public void display() {
    System.out.println("Display the notification");
  }

  @Override
  public void display(String text, String image) {
    System.out.println("Display the notification text " + text);
    System.out.println("Display the notification text " + image);
  }

  public void handleAction(String action, String emailID) {
    System.out.println("Performing action: " + action + " on email with ID: " + emailID);
  }

  public void handleAction(String action, String emailID, boolean confirm) {
    if (confirm) {
      System.out.println("Performing action: " + action + " on email with ID: " + emailID);
      System.out.println("Action confirmed.");
    } else {
      System.out.println("Action: " + action + " on email with ID: " + emailID + " has been canceled.");
    }
  }
}
