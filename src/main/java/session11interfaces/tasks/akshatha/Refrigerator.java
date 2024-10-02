package session11interfaces.tasks.akshatha;

public class Refrigerator implements ElectronicDevice {

  private boolean on;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Refrigerator is now on.");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Refrigerator is now off.");
  }

  @Override
  public boolean isOn() {
    return on;
  }
}
