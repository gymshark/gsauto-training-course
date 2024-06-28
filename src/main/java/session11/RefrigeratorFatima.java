package session11;

public class RefrigeratorFatima implements ElectronicDeviceFatima {


    @Override
    public void turnOn() {
        if (isOn()) {
            System.out.println("The Refrigerator is now on");
        } else System.out.println("The Refrigerator is already on");
    }

    @Override
    public void turnOff() {
        if (!isOn()) {
            System.out.println("The Refrigerator is now off");
        } else System.out.println("The Refrigerator is already off");
    }

    @Override
    public boolean isOn() {
        return false;
    }
}
