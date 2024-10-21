package session11interfaces.tasks.akeem;

public class DeviceTest {
    public static void main(String[] args) {
        Television television = new Television();
        Fridge fridge = new Fridge();
        Lamp lamp = new Lamp();

        television.turnOn();
        television.turnOff();
        System.out.println();

        fridge.turnOn();
        fridge.turnOff();
        System.out.println();

        lamp.turnOn();
        lamp.turnOff();
    }
}
