package session9inheritanceabstract.tasks.akeem;

public class OfficeWorker extends Worker{
    public OfficeWorker(String name, String department) {
        super(name, department);
    }

    @Override
    public void work() {
        System.out.println(name + " is processing paperwork in " + department);
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " is eating in the canteen");
    }
}
