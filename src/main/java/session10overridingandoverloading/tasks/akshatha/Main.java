package session10overridingandoverloading.tasks.akshatha;

public class Main {

  public static void main(String[] args) {
    // Creating instances
    Notification basicNotification = new Notification();
    EmailNotification emailNotification = new EmailNotification();

    // Displaying notifications using base class methods
    basicNotification.display();
    basicNotification.display("You've got a new message!", "http://example.com/image.jpg");

    System.out.println();

    // Displaying notifications using subclass methods
    emailNotification.display();
    emailNotification.display("Meeting at 10 AM", "http://example.com/meeting.jpg");

    System.out.println();

    // Handling actions
    emailNotification.handleAction("Read", "12345");
    emailNotification.handleAction("Delete", "12345", true);
  }
}
