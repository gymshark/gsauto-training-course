package session8constantsmethods.tasks;

public class StringUtilsAkshatha {
    public static String DEFAULT_STRING = "My Automation course";

    public static String toUpperCase(String input) {
        return DEFAULT_STRING.toUpperCase();
    }

    public static int vowelCount(String input) {
        String vowelString = input.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < vowelString.length(); i++) {
            if (vowelString.charAt(i) == 'a' || vowelString.charAt(i) == 'e' || vowelString.charAt(i) == 'i' || vowelString.charAt(i) == 'o' || vowelString.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
