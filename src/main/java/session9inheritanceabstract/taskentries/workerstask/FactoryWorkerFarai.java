package session9inheritanceabstract.taskentries.workerstask;

public class FactoryWorkerFarai extends WorkerFarai {

  public FactoryWorkerFarai(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " is an factory based worker in the " + department + " department");
  }

  @Override
  public void takeBreak() {
    System.out.println("The " + department + " department has an hour lunch break at 1pm");
  }
}
