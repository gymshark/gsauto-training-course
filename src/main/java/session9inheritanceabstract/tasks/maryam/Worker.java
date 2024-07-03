package session9inheritanceabstract.tasks.maryam;

public abstract class Worker {
    protected String name;
    protected   String department;

    // parameterized constructor
    Worker(String name,  String department)
    {
        this.name = name;
        this.department = department;

    }
    // abstract methords
    public abstract void work();
    public  abstract void takeBreak();

    // Concrete method
    public void workerinformation()
    {
        System.out.println("Name:" + name +  ", Department:" + department);

    }

}