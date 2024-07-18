package session5strings.tasks;

public class StringsExerciseMaria {

    public static void main(String[] args) {
        String email = "maria.prabhakar@gmail.com";
        String name = "Maria Prabhakar";
        //Use of String methods to extract username
        String extractedUserName = email.substring(0, email.indexOf('@'));

        //Converting name to Upper case
        String upperCaseName = name.toUpperCase();

        //String equality Check - replacing all spaces with dots to match extracted username
        String replacedName = name.replaceAll(" ", ".");
        boolean comparisonResult = extractedUserName.equalsIgnoreCase(replacedName);

        // Use String builder to print summarised result
      String results = "Original email - " + email + "\n" + "Extracted username - " + extractedUserName + "\n" +
        "Name in upper case - " + upperCaseName + "\n" + "Comparison results - " + comparisonResult;
        System.out.println(results);
    }
}
