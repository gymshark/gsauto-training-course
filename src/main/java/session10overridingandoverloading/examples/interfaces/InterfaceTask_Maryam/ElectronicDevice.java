package session10overridingandoverloading.examples.interfaces.InterfaceTask_Maryam;

public interface ElectronicDevice {

    default void systemError () {
        System.out.println("Sorry this is a system error");
    }

    //Abstract methods - no body declared
    void turnON();
    void  turnOff();
    boolean isOn();

}
