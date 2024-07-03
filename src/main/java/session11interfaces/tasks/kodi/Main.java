package session11interfaces.tasks.kodi;

public class Main {

  public static void main(String[] args) {

    ElectronicDevice television = new Television();
    ElectronicDevice microwave = new Microwave();
    ElectronicDevice fridge = new Fridge();

    System.out.println("** Television **");
    television.turnOn();
    System.out.println("Television is on: " + television.isOn());
    television.turnOff();
    System.out.println("Television is on: " + television.isOn());

    System.out.println();

    System.out.println("** Fridge **");
    fridge.turnOn();
    System.out.println("Fridge is on: " + fridge.isOn());
    fridge.turnOff();
    System.out.println("Fridge is on: " + fridge.isOn());

    System.out.println();

    System.out.println("** Microwave **");
    microwave.turnOn();
    System.out.println("Microwave is on: " + microwave.isOn());
    microwave.turnOff();
    System.out.println("Microwave is on: " + microwave.isOn());
  }
}
