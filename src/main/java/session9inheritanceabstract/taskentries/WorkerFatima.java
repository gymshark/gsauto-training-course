package session9inheritanceabstract.taskentries;

public abstract class WorkerFatima {
    String name;
    String department;

    public WorkerFatima(String name, String department) {
        this.name = name;
        this.department = department;
    }

    abstract void work();

    abstract void takeBreak();

    public String displayBasicInformation() {
        return "Worker: " + name + ". Department: " + department;
    }


}
