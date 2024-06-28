package session10overridingandoverloading.examples.interfaces.InterfacesTask_Maria;

public class Refrigerator implements ElectronicDevice {

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned on , food is cold ");
    }

    @Override

    public void turnOff() {
        System.out.println("Refrigerator is turned off");
    }

    @Override

    public boolean isOn() {
        return false;
    }
}
