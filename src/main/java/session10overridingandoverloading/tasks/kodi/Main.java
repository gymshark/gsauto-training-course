package session10overridingandoverloading.tasks.kodi;

public class Main {

  public static void main(String[] args) {
    Notification basicNotification = new Notification();
    basicNotification.displayNotification();
    basicNotification.displayNotification("This is a test notification");
    basicNotification.displayNotification("Check out these shorts!!", "https://uk.gymshark.com/products/gymshark-crest-cargo-shorts-light-grey-marl" +
      "-aw23");
    basicNotification.displayNotification("Kodi-Lee Johnson", "Check out these shorts", "https://uk.gymshark.com/products/gymshark-crest-cargo" +
      "-shorts-light-grey-marl-aw23");

    System.out.println();

    EmailNotification emailNotification = new EmailNotification();
    emailNotification.displayNotification();
    emailNotification.displayNotification("This is a test Email notification");
    emailNotification.displayNotification("Check out these shorts!!", "https://uk.gymshark.com/products/gymshark-crest-cargo-shorts-light-grey-marl" +
      "-aw23");
    emailNotification.displayNotification("Kodi-Lee Johnson", "Check out these shorts!!", "https://uk.gymshark.com/products/gymshark-crest-cargo" +
      "-shorts-light-grey-marl-aw23");

    emailNotification.isEmailRead(false);
    emailNotification.deleteEmail();
  }
}
