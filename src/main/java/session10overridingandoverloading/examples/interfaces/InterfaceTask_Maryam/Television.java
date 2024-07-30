package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Television implements ElectronicDevice{

    private boolean power;

    @Override
    public void turnON() {
        if (!power){
        power = true;
        System.out.println("Television is on");}
        else {
            System.out.println("Television is already on");
        }

    }

    @Override
    public void turnOff() {
        if (!power) {
        power = false;
        System.out.println("Television is off");}
        else  {
            System.out.println("Television is already off");
        }

    }

    @Override
    public boolean isOn() {
        return power;
    }
}
