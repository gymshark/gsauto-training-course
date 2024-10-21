package session10overridingandoverloading.tasks.akeem;

public class EmailNotification extends Notification{

    @Override
    public void displayNotifications() {
        System.out.println("Email");
    }
    @Override
    public void displayNotifications(String text, String image) {
        System.out.println(text + "\n" + image );
    }

    public void read() {
        System.out.println("Email read");
    }

    public void delete() {
        System.out.println("Email deleted");
    }

    public void draft() {
        System.out.println("Added to draft");
    }
}
