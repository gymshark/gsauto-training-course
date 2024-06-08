package session5strings;

public class StringsExerciseKodi {

  public static void main(String[] args) {

    String name = "Kodi Johnson";
    String email = "kodi.johnson@gymshark.com";

    // Extract username from email
    String userName = email.substring(0, email.indexOf('@'));

    // Convert name to uppercase
    String upperCaseName = name.toUpperCase();

    // Compare username with formatted name
    String newFormatName = name.replaceAll(" ", ".").toLowerCase();

    // Validate username matches new format name
    boolean validateName = userName.equalsIgnoreCase(newFormatName);

    //Validate with if statement
    /* if (validateName) {
      System.out.println("Username is a match: " + true);
    }
    else System.out.println("Username does not match: " + false);
    */

    StringBuilder outputResults = new StringBuilder();
    System.out.println("Output Results");
    outputResults.append("Original Email: ").append(email).append("\n")
      .append("Extracted Username: ").append(userName).append("\n")
      .append("Uppercase Name: ").append(upperCaseName).append("\n")
      .append("Results comparison: ").append(validateName);

    System.out.println(outputResults);
  }
}
