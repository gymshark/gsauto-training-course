package session9inheritanceabstract.tasks.akshatha;

public class OfficeWorker extends Worker {

  public OfficeWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + "who works in " + department + " is processing the paperwork ");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + "who works in " + department + " is taking a break after the busy day ");
  }
}
