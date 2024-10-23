package session9inheritanceabstract.tasks.akeem;

public abstract class Worker {
    protected String name;
    protected String department;

    public Worker(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public abstract void work();
    public abstract void takeBreak();

    public String basicWorkerInfo() {
        return "Name: " + name + "\n" + "Department: " + department;
    }

}
