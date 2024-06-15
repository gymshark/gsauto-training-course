package session8constantsmethods;

public class StringUtilsKodi {

  public static final String DEFAULT_STRING = "love";

  public static String toUppercase(String input) {
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

  public static void main(String[] args) {
    System.out.println("Display string in uppercase: " + toUppercase(DEFAULT_STRING));
    System.out.println("Number of vowels in the string: " + countVowels(DEFAULT_STRING));
  }

}
