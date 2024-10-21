package session9inheritanceabstract.tasks.akeem;

public class RemoteWorker extends Worker{
    public RemoteWorker(String name, String department) {
        super(name, department);
    }

    @Override
    public void work() {
        System.out.println(name + " has a heavy day of zoom meetings for the " + department + " department");
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " goes to the gym during their lunch break");
    }
}
