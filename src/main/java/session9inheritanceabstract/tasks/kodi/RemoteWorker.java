package session9inheritanceabstract.tasks.kodi;

public class RemoteWorker extends Worker {

  public RemoteWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " from " + department + " is working sprint work tasks");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + " from " + department + " has gone to the gym");

  }
}