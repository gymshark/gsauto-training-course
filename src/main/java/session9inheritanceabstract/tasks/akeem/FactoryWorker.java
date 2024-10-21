package session9inheritanceabstract.tasks.akeem;

public class FactoryWorker extends Worker {
    public FactoryWorker(String name, String department) {
        super(name, department);
    }

    @Override
    public void work() {
        System.out.println(name + " is maneuvering the materials in " + department);
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " only has a 45 minute break");
    }
}
