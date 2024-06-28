package session11;

public class TelevisionFatima implements ElectronicDeviceFatima {

    @Override
    public void turnOn() {
        if (isOn()) {
            System.out.println("The television is now on");
        } else System.out.println("The television is already on");
    }

    @Override
    public void turnOff() {
        if (!isOn()) {
            System.out.println("The television is now off");
        } else {
            System.out.println("The television is already off");
        }
    }

    @Override
    public boolean isOn() {
        return false;
    }


}
