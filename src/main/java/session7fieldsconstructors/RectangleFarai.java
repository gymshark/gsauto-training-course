package session7fieldsconstructors;

public class RectangleFarai {

  private double length;
  private double width;

  public RectangleFarai() {
    this.length = 1.0;
    this.width = 1.0;
  }

  public RectangleFarai(double length, double width) {
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
    RectangleFarai defaultRectangleFarai = new RectangleFarai();
    RectangleFarai parameterisedRectangleFarai = new RectangleFarai(2.2, 3.2);

    System.out.println("Default rectangle details:");
    defaultRectangleFarai.rectangleDetails();

    System.out.println("Parameterised rectangle details:");
    parameterisedRectangleFarai.rectangleDetails();
  }
}