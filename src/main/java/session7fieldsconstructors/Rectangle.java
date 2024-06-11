package session7fieldsconstructors;

public class Rectangle {

  private double length;
  private double width;

  public Rectangle() {
    this.length = 1.0;
    this.width = 1.0;
  }

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double calculateArea(double length, double width) {
    return length * width;
  }

  public double calculateParameter(double length, double width) {
    return (2 * (length + width));
  }

  public void rectangleDetails() {
    System.out.println("The length: " + getLength());
    System.out.println("The width: " + getWidth());
    System.out.printf("The area: %.2f \n", calculateArea(getLength(), getWidth()));
    System.out.printf("The perimeter: %.2f \n", calculateParameter(getLength(), getWidth()));
  }

  public static void main(String[] args) {
    Rectangle defaultRectangle = new Rectangle();
    Rectangle parameterisedRectangle = new Rectangle(2.2, 3.2);

    System.out.println("Default rectangle details:");
    defaultRectangle.rectangleDetails();

    System.out.println("Parameterised rectangle details:");
    parameterisedRectangle.rectangleDetails();
  }
}