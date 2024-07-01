package session11;

public class DeviceTestFatima {
    public static void main(String[] args) {

        TelevisionFatima tv = new TelevisionFatima();
        RefrigeratorFatima fridge = new RefrigeratorFatima();
        LampFatima lamp = new LampFatima();

        tv.turnOff();
        tv.isOn();

        lamp.turnOff();
        lamp.isOn();
        lamp.turnOn();
        lamp.isOn();

        fridge.isOn();
        fridge.turnOn();

    }
}
