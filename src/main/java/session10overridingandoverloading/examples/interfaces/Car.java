package session10overridingandoverloading.examples.interfaces;

public interface Car {

  //Default method
  default void start() {
    System.out.println("Car started");
  }

  //Abstract methods - no body declared
  void drive();

  void stop();


}
