package session11interfaces.tasks.akeem;

public class Lamp implements ElectronicDevice {
    public boolean power;

    @Override
    public void turnOn() {
        power = true;
        isOn();
    }

    @Override
    public void turnOff() {
        power = false;
        isOn();
    }

    @Override
    public boolean isOn() {
        if (power) {
            System.out.println("Lamp is on");
        } else {
            System.out.println("Lamp is off");
        }
        return power;
    }
}
