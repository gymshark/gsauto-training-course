package session11interfaces.tasks.maria;

public class Refrigerator implements ElectronicDevice {

  private boolean on = false;

  @Override

  public void turnOn() {
    if (!on) {
      System.out.println("Refrigerator is OFF, turn it ON");
      on = true;
      System.out.println("Refrigerator has now been turned ON");

    } else {
      System.out.println("Refrigerator is already ON");
    }
  }

  @Override

  public void turnOff() {

    if (on) {
      System.out.println("Refrigerator is ON, turn it OFF");
      on = false;
      System.out.println("Refrigerator has now been turned OFF");

    } else {
      System.out.println("Refrigerator is already turned OFF");
    }

  }

  @Override

  public boolean isOn() {

    System.out.println("Is the Refrigerator ON - " + on);
    return on;

  }
}
