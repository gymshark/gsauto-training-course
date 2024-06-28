package session10overridingandoverloading.examples.interfaces.InterfacesTask_Maria;

public class Toaster implements ElectronicDevice {
    @Override

    public void turnOn() {
        System.out.println("Toaster is turned on and the bread is cooking");
    }

    @Override

    public void turnOff() {
        System.out.println("Toaster is turned off");
    }

    @Override

    public boolean isOn() {

        return false;

    }
}
