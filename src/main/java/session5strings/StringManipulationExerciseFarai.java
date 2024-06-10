package session5strings;

public class StringManipulationExerciseFarai {

  public static void main(String[] args) {

    String email = "farai.kumire@gymshark.com";
    String name = "Farai Kumire";

    String userName = email.substring(0, email.indexOf('@'));
    System.out.println("The username: " + userName);

    String nameToUpperCase = name.toUpperCase();
    System.out.println("The name: " + name);
    System.out.println("The name all uppercase: " + nameToUpperCase);

    String reformatName = name.replaceAll(" ", ".");
    System.out.println("The reformatted name: " + reformatName);

    boolean compareName = userName.equalsIgnoreCase(reformatName);
    System.out.println("Are the names equal ?: " + compareName);

    StringBuilder sb = new StringBuilder();
    sb.append(String.format("The username: %s%n", userName)).append(String.format("Email: %s%n", email)).append(String.format("Uppercase Name: %s%n",
      nameToUpperCase)).append("The values are equal ").append(compareName);
    String formattedMessage = sb.toString();
    System.out.println(formattedMessage);

  }

}
