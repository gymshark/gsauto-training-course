package session10overridingandoverloading.examples.methods.MethodOverLoadOverRide_Maria;

public class EmailNotification extends Notification {


    /**
     * Overridden method from Notifications class , accepts 2 parameters
     *
     * @param text
     * @param imageAttachment
     */
    @Override

    public void displayNotifications(String text, String imageAttachment) {

        System.out.println("Email Notifications should have some text -" + text + " ," + imageAttachment);
        System.out.println("This is an email with images");

    }

    /**
     * * Overridden method from Notifications class , accepts 1 parameter
     *
     * @param text
     */
    @Override
    public void displayNotifications(String text) {
        System.out.println("Displays email notifications text only - " + text);
    }

    /**
     * Method that reads Email notifications and accepts one parameter
     *
     * @param text
     */
    public void readEmailNotifications(String text) {
        System.out.println("Method to read all email notification with text - " + text);

    }

    /**
     * Overloaded Method that reads Email notifications and accepts 2 parameters
     *
     * @param text,read
     */
    public void readEmailNotifications(String text, boolean read) {
        System.out.println("Email notification with text - " + text + " has been read - " + read);

    }

    /**
     * Method that deletes Email notifications and accepts one parameter
     *
     * @param text
     */
    public void deleteEmailNotifications(String text) {
        System.out.println("Method deletes email notifications with text - " + text);

    }

    /**
     * Overloaded Method that deletes Email notifications and accepts 2 parameters
     *
     * @param text,read
     */
    public void deleteEmailNotifications(String text, int count) {
        System.out.println("Email notifications deleted with text such as -" + text + " ,and after deleting the count is - " + count);
    }


}

