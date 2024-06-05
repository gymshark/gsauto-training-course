package session5strings;

import java.util.function.ToDoubleBiFunction;

public class StringManipulationAndFormattingFatima {


    public static void main(String[] args) {
        //String Methods:
        //Hint: Use substring and indexOf methods. (May need to use google here to use both methods in conjunction with 1 another)

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
        message.append("The original email is ");
        message.append(emailAddress + " ");
        message.append("the extracted username is ");
        message.append(emailAddress.substring(0, 12) + " ");
        message.append("the uppercase name is ");
        message.append(name.toUpperCase() + " ");
        message.append("Is the username and name equal? ");
        message.append(emailAddress.replaceAll("\\.", " ").substring(0, 12).equalsIgnoreCase(name));

        System.out.println(message);


        String.format("The original email is %s, the extracted username is %s, the uppercase name is %s, " +
                "Is the username and name equal? %b ", emailAddress, emailAddress, name, emailAddress);

    }

    //TODO FIX STRING BUILDER

    //Use StringBuilder:
    //Create a formatted message that summarizes the results using StringBuilder.
    //Include the original email, the extracted username, the uppercase name, and the result of the comparison.

    //Output the Results:
    //Print the formatted message to the console.
}
