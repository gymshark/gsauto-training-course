package session9inheritanceabstract.taskentries.companyworkersystemkodi;

public class OfficeWorker extends Worker {

  public OfficeWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " from " + department + " is working on his self assessment");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + " from " + department + " is having lunch in the social");
  }
}
