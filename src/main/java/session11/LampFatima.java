package session11;

public class LampFatima implements ElectronicDeviceFatima {

    private boolean isOn = false;

    @Override
    public void turnOff() {
        if (isOn()) {
            System.out.println("The Lamp is now on");
            isOn = true;
        } else System.out.println("The lamp is already on");
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            System.out.println("The Lamp is now off");
            isOn = false;
        } else System.out.println("The lamp is already off");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
