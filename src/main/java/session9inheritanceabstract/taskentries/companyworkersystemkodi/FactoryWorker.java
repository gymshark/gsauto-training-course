package session9inheritanceabstract.taskentries.companyworkersystemkodi;

public class FactoryWorker extends Worker {

  public FactoryWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " on the " + department + " is working on the machine lathe");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + " on the " + department + " is taking a break in the machine shop den");

  }
}
