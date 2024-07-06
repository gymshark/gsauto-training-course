package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Refrigirator implements ElectronicDevice{

    private boolean power;

    @Override
    public void turnON() {
        if (!power){
       power= true;
        System.out.println("Refrigerator is on");}
        else {
            System.out.println("Refrigerator is already on");
        }
    }

    @Override
    public void turnOff() {
        if(!power){
        power = true;
        System.out.println("Refrigerator is off");}
        else {
            System.out.println("Refrigerator is already off");}
    }

    @Override
    public boolean isOn() {
        return power;
    }
}
