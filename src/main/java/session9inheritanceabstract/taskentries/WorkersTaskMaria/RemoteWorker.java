package session9inheritanceabstract.taskentries.WorkersTaskMaria;

public class RemoteWorker extends Workers {

//Super class constructor

    public RemoteWorker(String name, String department) {
        super(name, department);
    }

    // Method defining the type of work and the department of the Remote Worker
    @Override
    public void work() {

        System.out.println(getName() + " is writing some code during their WFH and belongs to " + getDepartment() + " department");

    }
// Method that prints the place/duration of the workers' break

    public void takeBreak() {
        System.out.println(getName() + " takes a break during WFH by taking a 20 min walk");
    }
}