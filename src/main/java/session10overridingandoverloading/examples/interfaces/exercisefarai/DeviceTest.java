package session10overridingandoverloading.examples.interfaces.exercisefarai;

public class DeviceTest {

  public static void main(String[] args) {

    ElectronicDevice myTv = new Television();
    ElectronicDevice myFridge = new Refrigerator();
    ElectronicDevice myLamp = new Lamp();

    myTv.turnOn();
    myTv.isOn();

    myTv.turnOff();
    myTv.isOn();

    myFridge.turnOn();
    myFridge.isOn();

    myFridge.turnOff();
    myFridge.isOn();

    myLamp.turnOn();
    myLamp.isOn();

    myLamp.turnOff();
    myLamp.isOn();
  }
}
