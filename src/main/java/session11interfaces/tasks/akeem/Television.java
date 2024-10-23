package session11interfaces.tasks.akeem;

public class Television implements ElectronicDevice {

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
            System.out.println("TV is on");
        } else {
            System.out.println("TV is off");
        }
        return power;
    }
}
