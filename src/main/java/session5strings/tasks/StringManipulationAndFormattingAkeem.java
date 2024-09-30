package session5strings.tasks;

public class StringManipulationAndFormattingAkeem {

  public static void main(String[] args) {

    //Predefined Data
    String email = "akeem.watson@gymshark.com";
    String name = "Akeem Watson";

    //String Methods
    String extractedUsername = email.substring(0, email.indexOf("@"));
    String nameUpperCased = name.toUpperCase();

    //String Equality
    boolean isNameMatched = extractedUsername.equalsIgnoreCase(name.replaceAll(" ", "."));

    //StringBuilder
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder message = stringBuilder.append(email).append("\n").append(extractedUsername).append("\n")
      .append(nameUpperCased).append("\n").append(isNameMatched);

    System.out.println(message);
  }
}
