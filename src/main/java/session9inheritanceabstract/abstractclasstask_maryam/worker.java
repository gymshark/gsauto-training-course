package session9inheritanceabstract.abstractclasstask_maryam;

public abstract class worker {
    protected String name;
    protected   String department;

    // parameterized constructor
    worker(String name,  String department)
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
