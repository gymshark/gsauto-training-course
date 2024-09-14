package session10overridingandoverloading.tasks.akshatha;

public class Notification {

  public void display() {
    System.out.println("Display the notification");
  }

  public void display(String text, String image) {
    System.out.println("Display the notification text " + text);
    System.out.println("Display the notification text " + image);
  }
}
