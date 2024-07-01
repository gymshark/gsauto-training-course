package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Television implements ElectronicDevice{

    private boolean power;

    @Override
    public void turnON() {
        power = true;
        System.out.println("Television is on");

    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("Television is off");
    }

    @Override
    public boolean isOn() {
        return power;
    }
}
