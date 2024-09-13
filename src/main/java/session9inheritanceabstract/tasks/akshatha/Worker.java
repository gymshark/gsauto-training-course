package session9inheritanceabstract.tasks.akshatha;

abstract class Worker {

  String name;
  String department;

  public Worker(String name, String department) {
    this.name = name;
    this.department = department;
  }

  public abstract void work();

  public abstract void takeBreak();

  public void displayBasicInfo() {
    System.out.println("Name of the Worker " + name);
    System.out.println("Department the worker belongs " + department);
  }
}
