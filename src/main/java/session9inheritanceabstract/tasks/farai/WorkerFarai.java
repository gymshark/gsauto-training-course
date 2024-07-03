package session9inheritanceabstract.tasks.farai;

abstract class WorkerFarai {

  String name;
  String department;

  public WorkerFarai(String name, String department) {
    this.name = name;
    this.department = department;
  }

  public abstract void work();

  public abstract void takeBreak();

  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Department: " + department);
  }
}
