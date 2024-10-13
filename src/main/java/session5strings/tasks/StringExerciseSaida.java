package session5strings.tasks;

public class StringExerciseSaida {
    public static void main(String[] args) {
        String email = "john.doe@example.com";
        String name = "John Doe";

        String username = email.substring(0,email.indexOf('@'));
        String upperCaseName = username.toUpperCase();

        String replacingNewName = name.replaceAll(" ", ".");

        boolean namesEquality = replacingNewName.equalsIgnoreCase(upperCaseName);

        StringBuilder message = new StringBuilder();
        message.append("The original email is ").append(email).append("\n");
        message.append("Extracted username is ").append(username).append("\n");
        message.append("Formatted name to Uppercase is ").append(upperCaseName).append("\n");
        message.append("Comparing the name to username is ").append(namesEquality).append("\n");
        System.out.println(message);
    }
}
