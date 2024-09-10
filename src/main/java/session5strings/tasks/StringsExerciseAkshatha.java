package session5strings.tasks;

public class StringsExerciseAkshatha {
    public static <string> void main(String[] args) {
        String email = "akshatha.shivananjappa@gymshark.com";
        String name = "akshatha shivananjappa";

        String userName = email.substring(0,email.indexOf("@"));

        String nameToUpperCase = name.toUpperCase();

        String formatName = name.replaceAll(" ", ".");
        boolean compareName = userName.equalsIgnoreCase(formatName);

        StringBuilder results = new StringBuilder();
        results.append("The original email is ").append(email).append("\n");
        results.append("Extracted username is ").append(userName).append("\n");
        results.append("Formatted name to Uppercase is ").append(nameToUpperCase).append("\n");
        results.append("Comparing the name to username is ").append(compareName).append("\n");
        System.out.println(results);
    }
}
