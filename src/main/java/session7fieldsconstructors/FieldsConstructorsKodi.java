package session7fieldsconstructors;

public class FieldsConstructorsKodi {

  // Create fields
  private final double length;
  private final double width;

  // Create a default constructor
  public FieldsConstructorsKodi() {
    this.length = 1.0;
    this.width = 1.0;
  }

  // Create a parameterized constructor
  public FieldsConstructorsKodi(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Implement method to calculate the area (length * width)
  public double calculateArea() {
    return (length * width);
  }

  // Implement method to calculate perimeter (2 * (length + width))
  public double calculatePerimeter() {
    return (2 * (this.width + this.length));
  }

  // Implement a method to print the details of the rectangle
  public void displayRectangleDetails() {
    System.out.println("Rectangle Details:");
    System.out.println("Length: " + this.length);
    System.out.println("Width: " + this.width);
    System.out.println("Area: " + this.calculateArea());
    System.out.println("Perimeter: " + this.calculatePerimeter());
  }

  public static void main(String[] args) {

    // Default Constructor
    FieldsConstructorsKodi defaultRectangle = new FieldsConstructorsKodi();
    System.out.println("Default Constructor Rectangle:");
    defaultRectangle.displayRectangleDetails();

    // Parameterized constructor
    FieldsConstructorsKodi parameterizedRectangle = new FieldsConstructorsKodi(10.0, 8.0);
    System.out.println("\nParameterized Constructor Rectangle:");
    parameterizedRectangle.displayRectangleDetails();

  }
}
