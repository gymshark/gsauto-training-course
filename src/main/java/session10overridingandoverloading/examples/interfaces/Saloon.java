package session10overridingandoverloading.examples.interfaces;

public class Saloon implements Car {

  @Override
  public void drive() {
    System.out.println("Saloon is driving");
  }

  @Override
  public void start() {
    System.out.println("Saloon is starting");
  }

  @Override
  public void stop() {
    System.out.println("Saloon is stopping");
  }
}
