package session9inheritanceabstract.tasks.fatima;

public class OfficeWorkerFatima extends WorkerFatima {

    public OfficeWorkerFatima(String name, String department) {
        super(name, department);
    }

    @Override
    void work() {
        System.out.println(name + " is processing paperwork");
    }

    @Override
    void takeBreak() {
        System.out.println(name + " has not taken a break");
    }
}

