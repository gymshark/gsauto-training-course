package session8constantsmethods.tasks;

public class StringUtilsFatima {

  public static final String defaultString = "Hello World";

  public static String upperCase() {
    return defaultString.toUpperCase();
  }

  public static int countVowel() {
    int vowelCount = 0;
    for (int i = 0; i < defaultString.length(); i++) {
      if (defaultString.charAt(i) == 'a' || defaultString.charAt(i) == 'e' || defaultString.charAt(i) == 'i' ||
        defaultString.charAt(i) == 'o' || defaultString.charAt(i) == 'u') {
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
