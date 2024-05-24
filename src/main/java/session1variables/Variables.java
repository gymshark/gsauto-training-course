package session1variables;

public class Variables {

  public static void main(String[] args) {
    //Explicit conversion/casting
    double myDouble = 3.9999999999;
    int myIntFromTheDouble = (int) myDouble;

    System.out.println("My int value is: " + myIntFromTheDouble);

    //Implicit conversion/casting
    int myInt = 20;
    double myNewDouble = myInt;

    System.out.println("My double value is: " + myNewDouble);

    String myName = "Owyn";
    int age = 32;
    boolean isJavaFun = true;
  }
}
