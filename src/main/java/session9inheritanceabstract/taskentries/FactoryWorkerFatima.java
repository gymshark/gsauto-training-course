package session9inheritanceabstract.taskentries;

public class FactoryWorkerFatima extends WorkerFatima {

    public FactoryWorkerFatima(String name, String department) {
        super(name, department);
    }

    @Override
    void work() {
        System.out.println(name + " is currently using the machinery");
    }

    @Override
    void takeBreak() {
        System.out.println(name + " has not taken a break");
    }
}
