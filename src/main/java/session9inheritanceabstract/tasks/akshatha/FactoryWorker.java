package session9inheritanceabstract.tasks.akshatha;

public class FactoryWorker extends Worker {

  public FactoryWorker(String name, String department) {
    super(name, department);
  }

  @Override
  public void work() {
    System.out.println(name + "who works in " + department + " is running the machinery ");
  }

  @Override
  public void takeBreak() {
    System.out.println(name + "who works in " + department + " is taking a break after the busy day ");
  }
}
