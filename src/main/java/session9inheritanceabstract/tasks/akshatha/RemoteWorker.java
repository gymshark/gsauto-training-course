package session9inheritanceabstract.tasks.akshatha;

public class RemoteWorker extends Worker {

  public RemoteWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " who works in " + department + "is replying to emails");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + " who works in " + department + " is taking a break after early start ");
  }

}
