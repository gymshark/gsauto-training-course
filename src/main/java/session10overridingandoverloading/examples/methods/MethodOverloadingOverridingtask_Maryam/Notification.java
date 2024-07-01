package session10overridingandoverloading.examples.methods.MethodOverloadingOverridingtask_Maryam;

public class Notification {
    //method to display a string
    public void  display (String data)
    {
        System.out.println("User notification:" + " "  + data );
    }

    // method to display a string and image

    public void  display (String data, String imageUrl)
    {
        System.out.println("User notification:" + " " + data);
        System.out.println("Image" + imageUrl);

    }


}
