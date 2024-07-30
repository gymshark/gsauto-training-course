package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Lamp implements ElectronicDevice{

    private boolean power;

    @Override
    public void turnON() {
        if (!power) {
            power = true;
            System.out.println("Lamp is now on");
        }
        else {
                System.out.println("Lamp is already on");
            }

    }

    @Override
    public void turnOff() {
        if (!power) {
            power = true;
            System.out.println("Lamp is now off");
        }
        else {
            System.out.println("Lamp is already off");
        }

    }

    @Override
    public boolean isOn() {
       return power;
    }
}
