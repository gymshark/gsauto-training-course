package session7fieldsconstructors.examples;

public class Car {

  private static final int numberOfWheels = 4;  // Static field
  private String color;        // Instance field

  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();

    car1.color = "Red";
    car2.color = "Blue";

    // Accessing instance fields
    System.out.println(car1.color);
    System.out.println(car2.color);

    // Accessing static field
    System.out.println(Car.numberOfWheels);
  }
}