package session8constantsmethods;

public class StringUtilsFatima {

    public static final String DEFAULT_STRING = "Hello World";

    public static String upperCase() {
        return DEFAULT_STRING.toUpperCase();
    }

    public static int countVowel() {
        int vowelCount = 0;
        for (int i = 0; i < DEFAULT_STRING.length(); i++) {
            if (DEFAULT_STRING.charAt(i) == 'a' || DEFAULT_STRING.charAt(i) == 'e' || DEFAULT_STRING.charAt(i) == 'i' ||
                    DEFAULT_STRING.charAt(i) == 'o' || DEFAULT_STRING.charAt(i) == 'u') {
                vowelCount += 1;
            }
        }
        return vowelCount;
    }


    public static void main(String[] args) {
        System.out.println(upperCase());
        System.out.println(countVowel());
    }

}
