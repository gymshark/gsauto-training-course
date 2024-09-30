package session5strings.tasks;

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

    String result = "Original Name:" + name + "\n" +
      "UpperCase Name:" + UpperCaseName + "\n" +
      "Extracted Username:" + username + "\n" +
      "Does the username match the name? " + (nameEqualsTo ? "Yes" : "No") + "\n";
    System.out.println(result);

  }
}
