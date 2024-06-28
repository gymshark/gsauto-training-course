package session11;

public class LampFatima implements ElectronicDeviceFatima {

    @Override
    public void turnOn() {
        if (isOn()) {
            System.out.println("The Lamp is now on");
        } else System.out.println("The lamp is already on");
    }

    @Override
    public void turnOff() {
        if (!isOn()) {
            System.out.println("The Lamp is now off");
        } else System.out.println("The lamp is already off");
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
