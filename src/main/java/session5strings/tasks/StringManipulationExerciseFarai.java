package session5strings.tasks;

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

    String formattedMessage = String.format("The username: %s%n", userName) + String.format("Email: %s%n", email) + String.format("Uppercase Name: " +
        "%s%n",
      nameToUpperCase) +
      "The values are equal " + compareName;
    System.out.println(formattedMessage);

  }

}
