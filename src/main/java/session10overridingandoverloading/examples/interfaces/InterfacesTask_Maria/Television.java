package session10overridingandoverloading.examples.interfaces.InterfacesTask_Maria;

public class Television implements ElectronicDevice {
    @Override

    public void turnOn() {
        System.out.println("Television is turned on and  I can see movies ");
    }

    @Override

    public void turnOff() {
        System.out.println("Television is turned off");
    }

    @Override

    public boolean isOn() {

        return false;

    }
}
