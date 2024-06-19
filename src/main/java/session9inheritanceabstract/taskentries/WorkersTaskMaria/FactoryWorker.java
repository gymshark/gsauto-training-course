package session9inheritanceabstract.taskentries.WorkersTaskMaria;

public class FactoryWorker extends Workers {

//Super class constructor
    public FactoryWorker(String name, String department) {
        super(name, department);
    }

    // Method defining the type of work and the department of the Factory Worker
    @Override
    public void work() {

        System.out.println(getName() + " operates on the belt area in the factory and works in the " +
                getDepartment()+ " department");

    }
// Method that prints the place/duration of the workers' break
    public void takeBreak(){
        System.out.println(getName()+" takes a break in the Factory canteen for about 1 hour");
    }
}
