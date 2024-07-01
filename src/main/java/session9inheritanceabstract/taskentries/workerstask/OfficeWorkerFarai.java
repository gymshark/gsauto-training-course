package session9inheritanceabstract.taskentries.workerstask;

public class OfficeWorkerFarai extends WorkerFarai {

  public OfficeWorkerFarai(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " is an office worker based in the " + department + " department");
  }

  @Override
  public void takeBreak() {
    System.out.println("The " + department + " department has an hour lunch break");

  }
}
