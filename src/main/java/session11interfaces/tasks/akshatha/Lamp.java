package session11interfaces.tasks.akshatha;

public class Lamp implements ElectronicDevice {

  private boolean on;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Lamp is now on.");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Lamp is now off.");
  }

  @Override
  public boolean isOn() {
    return on;
  }
}
