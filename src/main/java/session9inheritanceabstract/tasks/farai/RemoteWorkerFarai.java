package session9inheritanceabstract.tasks.farai;

public class RemoteWorkerFarai extends WorkerFarai {

  public RemoteWorkerFarai(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " is an remote worker based in the " + department + " department");
  }

  @Override
  public void takeBreak() {
    System.out.println("The " + department + " department has a flexible lunch break policy");
  }
}
