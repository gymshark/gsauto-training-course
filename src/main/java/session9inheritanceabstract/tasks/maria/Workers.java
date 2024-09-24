package session9inheritanceabstract.tasks.maria;


public abstract class Workers {

  private final String name;
  private final String department;

  //Parent Class Constructor
  public Workers(String name, String department) {
    this.name = name;
    this.department = department;
  }

  //Getters
  public String getName() {
    return name;
  }

  // Two abstract methods work() and takeBreak()

  public String getDepartment() {
    return department;
  }

  public abstract void work();

  //Common method that can be shared by subclasses - Displays Workers basic information.

  public abstract void takeBreak();

  public void displayBasicInfo() {
    System.out.println("Worker name - " + name + " ,Department- " + department);
  }

  //Main Class
  public static void main(String[] args) {

    RemoteWorker r1 = new RemoteWorker("Mona", "Development");
    FactoryWorker f1 = new FactoryWorker("Hassan", "Machinery");
    OfficeWorker o1 = new OfficeWorker("Leo", "People ");

    // Displaying basic information of all types of workers - name and department.
    r1.displayBasicInfo();
    f1.displayBasicInfo();
    o1.displayBasicInfo();

    //Methods specifying the type of work and the breaks taken by each type of worker.
    r1.work();
    r1.takeBreak();
    f1.work();
    f1.takeBreak();
    o1.work();
    o1.takeBreak();

  }


}

