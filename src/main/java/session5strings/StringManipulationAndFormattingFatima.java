package session5strings;

import java.util.function.ToDoubleBiFunction;

public class StringManipulationAndFormattingFatima {


    public static void main(String[] args) {

        String emailAddress = "fatima.farah@outlook.com";
        String name = "Fatima Farah";

        //Methods
        System.out.println("The username is " + emailAddress.substring(0, 12));
        System.out.println("The index of h is " + emailAddress.substring(0, 12).indexOf('h'));
        System.out.println("The username in uppercase is " + emailAddress.toUpperCase());

        //Equality
        System.out.println("Are the username and name the same: " + emailAddress.replaceAll("\\.", " ")
                .substring(0, 12).equalsIgnoreCase(name));

        //String Builder
        StringBuilder message = new StringBuilder();

        String username = emailAddress.substring(0, 12);
        String upperCaseName = name.toUpperCase();
        boolean isTheUserNameEqualToName = emailAddress.replaceAll("\\.", " ")
                .substring(0, 12).equalsIgnoreCase(name);

        message.append(emailAddress).append(" ");
        message.append(username).append(" ");
        message.append(upperCaseName).append(" ");
        message.append(isTheUserNameEqualToName);

        System.out.printf("Email is is %s, Username is %s, the name is %s. Is username and name the same: %b"
                , emailAddress, username, upperCaseName, isTheUserNameEqualToName);

    }

}
