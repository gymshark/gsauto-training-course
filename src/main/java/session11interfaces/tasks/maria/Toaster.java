package session11interfaces.tasks.maria;

public class Toaster implements ElectronicDevice {

  private boolean on = false;

  @Override

  public void turnOn() {
    if (!on) {
      System.out.println("Toaster is OFF, turn it ON");
      on = true;
      System.out.println("Toaster has now been turned ON");


    } else {
      System.out.println("Toaster is already ON");
    }
  }

  @Override

  public void turnOff() {

    if (on) {
      System.out.println("Toaster is ON, turn it OFF");
      on = false;
      System.out.println("Toaster has now been turned OFF");

    } else {
      System.out.println("Toaster is already turned OFF");
    }

  }

  @Override

  public boolean isOn() {
    System.out.println("Is the Toaster ON - " + on);

    return on;

  }
}
