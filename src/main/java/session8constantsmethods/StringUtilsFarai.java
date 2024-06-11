package session8constantsmethods;

public class StringUtilsFarai {

  public static final String DEFAULT_STRING = "My string for the exercise";

  public static String toUppercase(String myConstant) {

    return myConstant.toUpperCase();
  }

  public static int countVowels(String myConstant) {
    int count = 0;

    for (int i = 0; i < myConstant.length(); i++) {

      if (myConstant
        .charAt(i) == 'a' || myConstant.charAt(i) == 'e'
        || myConstant.charAt(i) == 'i'
        || myConstant.charAt(i) == 'o'
        || myConstant.charAt(i) == 'u') {

        count++;
      }
    }
    return count;
  }
}
