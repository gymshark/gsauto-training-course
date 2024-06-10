package session7fieldsconstructors;

public class Car {

  private String color;        // Instance field
  private static int numberOfWheels = 4;  // Static field

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