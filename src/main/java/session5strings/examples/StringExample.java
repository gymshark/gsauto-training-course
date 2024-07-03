package session5strings.examples;

public class StringExample {

  public static void main(String[] args) {
    // Variables
    String fName = "John";
    String lName = "Doe";
    int age = 25;
    double gpa = 3.75;

    // String Class: Creating strings
    String greeting = "Hello";
    String farewell = new String("Goodbye");

    // String Equality: Comparing strings
    boolean isEqual = greeting.equals(farewell); // false
    boolean isSameRef = (greeting == farewell); // false

    // String Methods: Some common methods
    int length = greeting.length(); // 5
    char firstChar = greeting.charAt(0); // 'H'
    String upperGreeting = greeting.toUpperCase(); // "HELLO"

    // String Conversion: Converting other types to string
    String ageStr = String.valueOf(age); // "25"
    String gpaStr = Double.toString(gpa); // "3.75"

    // StringBuilder: Efficient string manipulation
    StringBuilder sb = new StringBuilder();
    sb.append(fName);
    sb.append(" ");
    sb.append(lName);
    String fullName = sb.toString();

    // String Concatenation using + operator
    String concatenated = fName + " " + lName;

    // String Formatting using String.format()
    String formatted = String.format("Name: %s %s, Age: %d, GPA: %.2f",
      fName, lName, age, gpa);

    // Using concatenation in a loop
    String repName = "";
    for (int i = 0; i < 3; i++) {
      repName += fName + " ";
    }

    // printf Formatting
    System.out.printf("Hello, %s! You are %d and your GPA is %.2f.%n",
      fullName, age, gpa);

    // Print statements
    System.out.println("Full: " + fullName);
    System.out.println("Concatenated: " + concatenated);
    System.out.println("Formatted: " + formatted);
    System.out.println("Repeat: " + repName);
    System.out.println("isEqual: " + isEqual);
    System.out.println("isSameRef: " + isSameRef);
    System.out.println("Length: " + length);
    System.out.println("First Char: " + firstChar);
    System.out.println("Upper: " + upperGreeting);
    System.out.println("Age Str: " + ageStr);
    System.out.println("GPA Str: " + gpaStr);
  }
}
