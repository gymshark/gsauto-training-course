package session10overridingandoverloading.examples.interfaces.InterfacesTask_Maria;

public class DeviceTest {

    public static void main(String[] args) {
        Refrigerator r1 = new Refrigerator();
        r1.turnOn();
        r1.isOn();

        Television t1 = new Television();
        t1.turnOff();
        t1.isOn();

        Toaster to1 = new Toaster();
        to1.turnOn();
        to1.isOn();
    }
}
