package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Lamp implements ElectronicDevice{

    private boolean power;

    @Override
    public void turnON() {
        power = true ;
        System.out.println("Lamp is now on");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("Lamp is now off");

    }

    @Override
    public boolean isOn() {
       return power;
    }
}
