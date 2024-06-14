package session8constantsmethods;

public class StringUtilsMaria {

    public static String DEFAULT_STRING = "I know there is nothing as significant as you";

    //Static method converting input string to upper case
    public static String toUppercase(String input) {
        String upperCase = input.toUpperCase();
        return upperCase;
    }

    //Static method counting  number of vowels in the input String
    public static int vowelCount(String input) {
        String str = input.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    // Main Method - Passing Default String into the input and invoking the static methods
    public static void main(String[] args) {

        System.out.println("Default string in uppercase - " + toUppercase(DEFAULT_STRING));
        System.out.println("Number of vowels in the Default String is - " + vowelCount(DEFAULT_STRING));

    }

}
