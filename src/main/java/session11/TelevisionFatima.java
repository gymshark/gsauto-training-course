package session11;

public class TelevisionFatima implements ElectronicDeviceFatima {
    private boolean isOn = false;

    @Override
    public void turnOff() {
        if (isOn()) {
            System.out.println("The television is now on");
            isOn = true;
        } else System.out.println("The television is already on");
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            System.out.println("The television is now off");
            isOn = false;
        } else {
            System.out.println("The television is already off");
        }
    }

    @Override
    public boolean isOn() {
        return isOn;
    }


}
