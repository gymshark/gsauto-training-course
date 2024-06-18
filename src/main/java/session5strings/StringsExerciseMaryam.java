package session5strings;

public class StringsExerciseMaryam {
    public static void main(String[] args) {
        // defining data for email and username
        String email = "maryam.adnan@gymshark.com";
        String name = "maryam adnan";

        // methods extracting user name
        int indexPosition = email.indexOf('@');
        String username = email.substring(0, indexPosition);

        // conversion of name to uppercase
        String UpperCaseName = name.toUpperCase();

        // comparing usernames
        String CompareName = name.replaceAll(" ", ".");
        boolean nameEqualsTo = username.equalsIgnoreCase(CompareName);

        // string builder

        StringBuilder result = new StringBuilder();
        result.append("Original Name:").append(name).append("\n");
        result.append("UpperCase Name:").append(UpperCaseName).append("\n");
        result.append("Extracted Username:").append(username).append("\n");
        result.append("Does the username match the name? ").append(nameEqualsTo ? "Yes" : "No").append("\n");
        System.out.println(result);

    }
}
