package session8constantsmethods.tasks;

public class StringUtilsSaida {
    public static final String DEFAULT_STRING = "Gymshark we do gym!";

    public static String upperCase() {
        return DEFAULT_STRING.toUpperCase();
    }

    public static int countVowels(){
        int vowelsCount = 0;
        for (int i = 0; i < DEFAULT_STRING.length(); i ++){
            if (DEFAULT_STRING.charAt(i) == 'a' || DEFAULT_STRING.charAt(i) == 'e' || DEFAULT_STRING.charAt(i) == 'i' ||
                    DEFAULT_STRING.charAt(i) == 'o' || DEFAULT_STRING.charAt(i) == 'u'){
                vowelsCount += 1;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(upperCase());
        System.out.println(countVowels());
    }
}






