package session11interfaces.tasks.kodi;

public class Fridge implements ElectronicDevice {

  private boolean powerOn = false;

  @Override
  public void turnOn() {
    if (!powerOn) {
      powerOn = true;
      System.out.println("fridge is now ON.");
    } else {
      System.out.println("fridge was already ON.");
    }
  }

  @Override
  public void turnOff() {
    if (powerOn) {
      powerOn = false;
      System.out.println("fridge is now OFF.");
    } else {
      System.out.println("fridge was already OFF.");
    }
  }

  @Override
  public boolean isOn() {
    return powerOn;
  }
}
