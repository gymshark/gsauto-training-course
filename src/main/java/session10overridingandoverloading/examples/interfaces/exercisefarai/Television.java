package session10overridingandoverloading.examples.interfaces.exercisefarai;

public class Television implements ElectronicDevice {

  private boolean on = false;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Television is now on");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Television is now off");
  }

  @Override
  public boolean isOn() {
    System.out.println("Is the television on? " + on);
    return on;
  }
}
