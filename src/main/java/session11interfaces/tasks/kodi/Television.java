package session11interfaces.tasks.kodi;

public class Television implements ElectronicDevice {

  private boolean powerOn = true;

  @Override
  public void turnOn() {
    if (!powerOn) {
      powerOn = true;
      System.out.println("Television is now ON.");
    } else System.out.println("Television was already ON");
  }

  @Override
  public void turnOff() {
    if (powerOn) {
      powerOn = false;
      System.out.println("Television is now OFF.");
    } else System.out.println("Television was already OFF");
  }

  @Override
  public boolean isOn() {
    return powerOn;
  }
}
