package session10overridingandoverloading.examples.methods.MethodOverloadingOverridingtask_Maryam;

import session8constantsmethods.StringUtilsMaryam;

public class EmailNotification extends Notification {

    @Override
    public void display(String data) {
        super.display(data);
        System.out.println("Sender: test1234@gmail.com");
        System.out.println();
    }

    @Override
    public void display(String data, String imageUrl) {
        super.display(data, imageUrl);
        System.out.println("Sender: test1234@gmail.com");
        System.out.println();
    }



    // method to read an email
    public void read (String emailid){
        System.out.println("Reading an email" + emailid);
    }
    // method to delete an email
    public void delete(String emailid)
    {
        System.out.println("Deleting an email" + emailid) ;
    }

}


