package session9inheritanceabstract.taskentries;

public class OfficeWorkerFatima extends WorkerFatima{

    public OfficeWorkerFatima(String name, String department) {
        super(name, department);
    }

    void work() {
        System.out.println(name + " is processing paperwork");
    }

    void takeBreak() {
        System.out.println(name + " has not taken a break");
    }
}

