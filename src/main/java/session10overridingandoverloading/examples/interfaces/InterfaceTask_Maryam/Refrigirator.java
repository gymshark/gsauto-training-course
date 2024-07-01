package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Refrigirator implements ElectronicDevice{

    private boolean power;

    @Override
    public void turnON() {
       power= true;
        System.out.println("Refrigerator is on");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("Refrigerator is off");
    }

    @Override
    public boolean isOn() {
        return power;
    }
}
