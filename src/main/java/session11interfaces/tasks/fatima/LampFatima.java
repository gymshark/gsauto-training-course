package session11interfaces.tasks.fatima;

public class LampFatima implements ElectronicDeviceFatima {

  private boolean isOn = false;

  @Override
  public void turnOff() {
    if (isOn()) {
      System.out.println("The Lamp has been switched off");
      isOn = false;
    } else System.out.println("The lamp is already off");
  }

  @Override
  public void turnOn() {
    if (!isOn()) {
      System.out.println("The Lamp has been switched on");
      isOn = true;
    } else System.out.println("The lamp is already on");
  }

  @Override
  public boolean isOn() {
    return isOn;
  }
}
