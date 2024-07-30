package session10overridingandoverloading.examples.interfaces.exercisefarai;

public class Refrigerator implements ElectronicDevice {

  private boolean on = false;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Refrigerator is now on");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Refrigerator is now off");
  }

  @Override
  public boolean isOn() {
    System.out.println("Is the refrigerator on? " + on);
    return on;
  }
}
