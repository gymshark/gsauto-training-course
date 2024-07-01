package session11;

public class RefrigeratorFatima implements ElectronicDeviceFatima {

    private boolean isOn = false;

    @Override
    public void turnOff() {
        if (isOn()) {
            System.out.println("The Refrigerator is now on");
            isOn = true;
        } else System.out.println("The Refrigerator is already on");
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            System.out.println("The Refrigerator is now off");
            isOn = false;
        } else System.out.println("The Refrigerator is already off");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
