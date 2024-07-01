package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public class Main {

    public static void main(String[] args) {
        ElectronicDevice lamp = new Lamp();
        ElectronicDevice tv = new Television();
        ElectronicDevice refrigerator  = new Refrigirator();

        // testing lamp
        lamp.turnON();
        System.out.println("Is lamp on?" + " " + lamp.isOn());
        System.out.println();
        lamp.turnOff();
        System.out.println("Is lamp off?" + " " + lamp.isOn());
        System.out.println();

        // testing television
        tv.turnON();
        System.out.println("Is tv on?" + " " + tv.isOn());
        System.out.println();
        tv.turnOff();
        System.out.println("Is tv off?" + " " +  tv.isOn());
        System.out.println();

        refrigerator.turnON();
        System.out.println("Is refrigerator on?" + " " + refrigerator.isOn());
        System.out.println();
        refrigerator.turnOff();
        System.out.println("Is refrigerator off?" + " " +  tv.isOn());
        System.out.println();



    }
}
