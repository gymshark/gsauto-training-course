package session10overridingandoverloading;

public class NotificationTestFarai {

  public static void main(String[] args) {


    EmailNotificationFarai emailNotification = new EmailNotificationFarai();

    emailNotification.displayNotification();
    emailNotification.displayNotification("Don't miss out on our Gymshark Summer Sale!");
    emailNotification.displayNotification("Huge discounts on Gymshark gear!", "https://uk.gymshark.com/_next/image?url=https%3A%2F%2Fimages" +
      ".ctfassets.net%2Fwl6q2in9o7k3%2F2SYCQ8r3fF8oFYE5ZOdmkL%2F3603f6507372f2d18f181ff7b336979e%2FDESKTOP-ENG.png&w=3840&q=90");
    emailNotification.isRead(true);
    emailNotification.delete();
  }
}
