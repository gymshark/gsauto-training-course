package session5strings.tasks;

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

        message.append("Email: ").append(emailAddress).append("\n");
        message.append("Username: ").append(username).append("\n");
        message.append("Name in Uppercase: ").append(upperCaseName).append("\n");
        message.append("Does the username match the name (ignoring case): ").append(isTheUserNameEqualToName);

        System.out.println(message);

        //old print statement - System.out.printf("Email is is %s, Username is %s, the name is %s. Is username and name the same: %b"
        //    ,emailAddress, username, upperCaseName, isTheUserNameEqualToName);


    }

}
