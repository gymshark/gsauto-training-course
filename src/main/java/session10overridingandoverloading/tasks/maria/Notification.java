package session10overridingandoverloading.tasks.maria;

public class Notification {

    /**
     * Method to display notifications with text and images
     * No parameters
     */
    public void displayNotifications() {
        System.out.println("Display notifications");
    }

    /**
     * Method to display notifications with text and images
     *
     * @param text
     * @param imageAttachment
     */
    public void displayNotifications(String text, String imageAttachment) {
        System.out.println("This is a notification that displays text and images -" + text + " ," + imageAttachment);
    }

    /**
     * Method to display notifications with text only
     *
     * @param text
     */
    public void displayNotifications(String text) {
        System.out.println("This is a notification that  contains only text - " + text);

    }
}
