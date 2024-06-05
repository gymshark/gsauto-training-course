package session5strings;

public class StringManipulationAndFormattingFatima {


    public static void main(String[] args) {
        //String Methods:
        //Hint: Use substring and indexOf methods. (May need to use google here to use both methods in conjunction with 1 another)

        String emailAddress = "fatima.farah@outlook.com";
        String name = "Fatima Farah";

        System.out.println("The username is " + emailAddress.substring(0,12));
        System.out.println("The index of h is " + emailAddress.substring(0,12).indexOf('h'));
        System.out.println("The username in uppercase is " + emailAddress.toUpperCase());

        System.out.println("Are the username and name the same: " + emailAddress.replaceAll("\\.", " ")
                .substring(0,12).equalsIgnoreCase(name));



    }


    //Use StringBuilder:
    //Create a formatted message that summarizes the results using StringBuilder.
    //Include the original email, the extracted username, the uppercase name, and the result of the comparison.

    //Output the Results:
    //Print the formatted message to the console.
}
