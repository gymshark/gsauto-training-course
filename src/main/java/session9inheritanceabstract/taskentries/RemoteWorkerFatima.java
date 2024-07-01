package session9inheritanceabstract.taskentries;

public class RemoteWorkerFatima extends WorkerFatima {

    public RemoteWorkerFatima(String name, String department) {
        super(name, department);
    }

    @Override
    void work() {
        System.out.println(name + " is currently working remotely");
    }

    @Override
    void takeBreak() {
        System.out.println(name + " has taken a break");
    }
}
