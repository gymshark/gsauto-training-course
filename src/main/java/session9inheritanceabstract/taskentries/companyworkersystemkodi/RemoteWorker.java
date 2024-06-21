package session9inheritanceabstract.taskentries.companyworkersystemkodi;

public class RemoteWorker extends Worker {

  public RemoteWorker(String name, String department) {
    super(name, department);
  }

  public void work() {
    System.out.println(name + " from " + department + " is working sprint work tasks");
  }

  public void takeBreak() {
    System.out.println(name + " from " + department + " has gone to the gym");

  }
}
