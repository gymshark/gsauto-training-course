package session10overridingandoverloading.examples.interfaces.exercisefarai;

public class Lamp implements ElectronicDevice {

  private boolean on = false;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Lamp is now on");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Lamp is now off");
  }

  @Override
  public boolean isOn() {
    System.out.println("Is the lamp on? " + on);
    return on;
  }
}
