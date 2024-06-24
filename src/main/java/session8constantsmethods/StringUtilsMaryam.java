package session8constantsmethods;

public class StringUtilsMaryam {
    // declaring constant for storing the default string with Final Constant mean its value cannot be changed
    public static final String Default_String = "This value cannot be changed";

    public static String toUppercase (String input) {

        return input.toUpperCase();
    }

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test the upperCasedMethod
        String Uppercased = StringUtilsMaryam.toUppercase(StringUtilsMaryam.Default_String);
        System.out.println("Uppercased:" + Uppercased );

        // Test the vowel count
        int VowelCount = StringUtilsMaryam.countVowels(StringUtilsMaryam.Default_String);
        System.out.println("Count Vowels:" + VowelCount);

    }





}
