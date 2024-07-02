package session10overridingandoverloading.interfacetaskkodi;

public class Microwave implements ElectronicDevice {

  private boolean powerOn = true;

  @Override
  public void turnOn() {
    if (!powerOn) {
      powerOn = true;
      System.out.println("The Microwave is now ON.");
    }
    else System.out.println("Microwave was already ON");
  }

  @Override
  public void turnOff() {
    if (powerOn) {
      powerOn = false;
      System.out.println("The Microwave is now OFF.");
    }
    else System.out.println("Microwave was already OFF");
  }

  @Override
  public boolean isOn() {
    return powerOn;
  }
}
