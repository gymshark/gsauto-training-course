package session8constantsmethods.tasks;

public class StringUtilsFarai {

  public static final String DEFAULT_STRING = "My string for the exercise";

  public static String toUppercase(String myConstant) {

    return myConstant.toUpperCase();
  }

  public static int countVowels(String myConstant) {
    int count = 0;
    String vowels = "AEIOUaeiou";

    for (int i = 0; i < myConstant.length(); i++) {

      char currentChar = myConstant.charAt(i);
      if (vowels.indexOf(currentChar) != -1) {
        count++;
      }
    }
    return count;
  }
}
