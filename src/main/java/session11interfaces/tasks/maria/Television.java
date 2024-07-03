package session11interfaces.tasks.maria;

public class Television implements ElectronicDevice{

    private boolean on = false;

    @Override

    public void turnOn() {
        if(!on){
            System.out.println("Television is OFF, turn it ON");
            on = true;
            System.out.println("Television has now been turned ON");


        }else {
            System.out.println("Television is already ON");
        }
    }

    @Override

    public void turnOff() {

        if(on) {
            System.out.println("Television is ON, turn it OFF");
            on = false;
            System.out.println("Television has now been turned OFF");

        }
        else{
            System.out.println("Television is already turned OFF");
        }

    }

    @Override

    public boolean isOn() {
        System.out.println("Is the Television ON  - " +on);

        return on;

    }
}
