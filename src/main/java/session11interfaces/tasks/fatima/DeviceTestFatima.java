package session11interfaces.tasks.fatima;

public class DeviceTestFatima {

  public static void main(String[] args) {

    TelevisionFatima tv = new TelevisionFatima();
    RefrigeratorFatima fridge = new RefrigeratorFatima();
    LampFatima lamp = new LampFatima();

    tv.turnOff();
    tv.isOn();

    lamp.turnOff();
    lamp.isOn();
    lamp.turnOn();
    lamp.isOn();

    fridge.turnOn();
    fridge.isOn();

  }
}
