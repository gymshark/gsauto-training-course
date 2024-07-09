package session11interfaces.tasks.fatima;

public class TelevisionFatima implements ElectronicDeviceFatima {
    private boolean isOn = false;

    @Override
    public void turnOff() {
        if (isOn()) {
            System.out.println("The television has been switched off");
            isOn = false;
        } else System.out.println("The television is already off");
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            System.out.println("The television has now been switched on");
            isOn = true;
        } else {
            System.out.println("The television is already on");
        }
    }

    @Override
    public boolean isOn() {
        return isOn;
    }


}
