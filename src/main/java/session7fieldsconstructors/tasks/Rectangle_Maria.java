package session7fieldsconstructors.tasks;

public class Rectangle_Maria {


  double rectangleLength;
  double rectangleWidth;

  //Default Constructor initialising length and width of rectangle
  public Rectangle_Maria() {
    this.rectangleLength = 1.0;
    this.rectangleWidth = 1.0;
  }

  //Parameterised constructor
  public Rectangle_Maria(double rectangleLength, double rectangleWidth) {
    this.rectangleLength = rectangleLength;
    this.rectangleWidth = rectangleWidth;
  }

  //Method to calculate Area of the rectangle.
  public double calculateRectangleArea() {
    double rectangleArea = rectangleLength * rectangleWidth;
    return rectangleArea;
  }

  //Method to calculate perimeter of the rectangle.
  public double calculateRectanglePerimeter() {
    double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
    return rectanglePerimeter;
  }

  //Method to print dimensions ,area and Perimeter of the Rectangles.
  public void printRectangleDetails() {
    System.out.println("Dimensions of the rectangle -" + "\n" + "Length - " + rectangleLength + "\n" +
      "Width - " + rectangleWidth);
    System.out.println("Rectangle area - " + calculateRectangleArea());
    System.out.println("Rectangle Perimeter -" + calculateRectanglePerimeter());

  }

  //Main Method
  public static void main(String[] args) {
    Rectangle_Maria rectangle1 = new Rectangle_Maria();

    Rectangle_Maria rectangle2 = new Rectangle_Maria(5.25, 6.9);
    rectangle1.printRectangleDetails();
    rectangle2.printRectangleDetails();
  }
}
