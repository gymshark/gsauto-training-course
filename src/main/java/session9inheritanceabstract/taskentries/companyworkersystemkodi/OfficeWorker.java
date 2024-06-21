package session9inheritanceabstract.taskentries.companyworkersystemkodi;

public class OfficeWorker extends Worker {

  public OfficeWorker(String name, String department) {
    super(name, department);
  }

  public void work() {
    System.out.println(name + " from " + department + " is working on his self assessment");
  }

  public void takeBreak() {
    System.out.println(name + " from " + department + " is having lunch in the social");
  }

}
