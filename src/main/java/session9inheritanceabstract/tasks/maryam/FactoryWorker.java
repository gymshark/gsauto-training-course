package session9inheritanceabstract.tasks.maryam;

public class FactoryWorker extends Worker {

  FactoryWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + " is working 12 hours shift on weekends");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + " is taking lunch break at 2pm");
  }
}
