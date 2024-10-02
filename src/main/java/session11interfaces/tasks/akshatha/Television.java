package session11interfaces.tasks.akshatha;

public class Television implements ElectronicDevice {

  private boolean on;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Television is now on.");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Television is now off.");
  }

  @Override
  public boolean isOn() {
    return on;
  }
}
