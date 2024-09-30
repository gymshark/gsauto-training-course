package session9inheritanceabstract.tasks.fatima;

public abstract class WorkerFatima {

  String name;
  String department;

  public WorkerFatima(String name, String department) {
    this.name = name;
    this.department = department;
  }

  public String displayBasicInformation() {
    return "Worker: " + name + ". Department: " + department;
  }

  abstract void work();

  abstract void takeBreak();


}
