package session10overridingandoverloading.examples.methods.MethodOverloadingOverridingtask_Maryam;

public class Main {
    public static void main(String[] args) {
        // using the base class
        Notification notification = new Notification();
        notification.display("User notification displayed");
        notification.display("User notification with image" , "https://picsum.photos/200/300");

        System.out.println();

        // calling the subclass (Email notification)
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.display("New  Email");
        emailNotification.display("New Email with Image" , "https://picsum.photos/200/300");
        System.out.println();

        // simulating reading and deleting

        emailNotification.read("12345");
        emailNotification.delete("12345");
    }
}
