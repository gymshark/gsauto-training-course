package session10overridingandoverloading.examples.interfaces;

public class SUV implements Car {

  @Override
  public void drive() {
    System.out.println("SUV is driving off-road");
  }

  @Override
  public void start() {
    System.out.println("SUV is starting");
  }

  @Override
  public void stop() {
    System.out.println("SUV is stopping");
  }
}
