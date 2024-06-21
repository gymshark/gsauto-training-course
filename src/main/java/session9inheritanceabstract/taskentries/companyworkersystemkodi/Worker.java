package session9inheritanceabstract.taskentries.companyworkersystemkodi;

public abstract class Worker {

  protected String name;
  protected String department;

  public Worker(String name, String department) {
    this.name = name;
    this.department = department;
  }

  // Define abstract methods work() and takeBreak()
  public abstract void work();
  public abstract void takeBreak();

  // Concrete method to display basic information about the worker
  public void displayWorkerInfo() {
    System.out.println("Name: " + name);
    System.out.println("Department: " + department);
  }


}

