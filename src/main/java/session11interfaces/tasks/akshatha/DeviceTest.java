package session11interfaces.tasks.akshatha;

public class DeviceTest {

  public static void main(String[] args) {
    ElectronicDevice television = new Television();
    ElectronicDevice fridge = new Refrigerator();
    ElectronicDevice lamp = new Lamp();

    // Television
    television.turnOn();
    System.out.println("Television is on: " + television.isOn());
    television.turnOff();
    System.out.println("Television is on: " + television.isOn());

    // Refrigerator
    fridge.turnOn();
    System.out.println("Refrigerator is on: " + fridge.isOn());
    fridge.turnOff();
    System.out.println("Refrigerator is on: " + fridge.isOn());

    // Lamp
    lamp.turnOn();
    System.out.println("Lamp is on: " + lamp.isOn());
    lamp.turnOff();
    System.out.println("Lamp is on: " + lamp.isOn());
  }
}
