package session7fieldsconstructors.tasks;

public class RectangleAkshatha {

  private final double length;
  private final double width;

  public RectangleAkshatha() {
    this.length = 1.0;
    this.width = 1.0;
  }

  public RectangleAkshatha(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double CalculateArea() {
    return length * width;
  }

  public double CalculatePerimeter() {
    return (2 * (length + width));
  }

  public void RectangleDetails() {
    System.out.println("The area of rectangle " + CalculateArea());
    System.out.println("The perimeter of a rectangle " + CalculatePerimeter());
  }

  public static void main(String[] args) {
    RectangleAkshatha rectangleOne = new RectangleAkshatha();
    RectangleAkshatha rectangleTwo = new RectangleAkshatha(2.5, 4.5);

    rectangleOne.RectangleDetails();
    rectangleTwo.RectangleDetails();
  }
}
