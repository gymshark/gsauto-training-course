package session10overridingandoverloading.examples.interfaces;

public class Coupe implements Car {

  @Override
  public void drive() {
    System.out.println("Coupe is driving smoothly");
  }

  @Override
  public void stop() {
    System.out.println("Coupe is stopping");
  }
}
