package session8constantsmethods.tasks;

public class StringUtilsAkeem {
    private static final String DEFAULT_STRING = "java task for constants and methods";

    public static void main(String[] args) {
        System.out.println(countVowels(DEFAULT_STRING));
        System.out.println(toUpperCase(DEFAULT_STRING));
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
