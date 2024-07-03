package session8constantsmethods.examples;

public class Circle {

  public static final double PI = 3.14159; // Constant for Pi

  public static double calculateArea(double radius) {
    return PI * radius * radius;
  }

  public static void main(String[] args) {
    double radius = 5.0;
    double area = calculateArea(radius);
    System.out.println("Area of the circle with radius " + radius + " is: " + area);
  }
}