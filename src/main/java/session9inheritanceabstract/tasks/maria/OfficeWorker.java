package session9inheritanceabstract.tasks.maria;


public class OfficeWorker extends Workers {

//Super class constructor

  public OfficeWorker(String name, String department) {
    super(name, department);
  }

  // Method defining the type of work and the department of the Office Worker

  @Override
  public void work() {

    System.out.println(getName() + " is processing some docs for the " + getDepartment() + " department");

  }

  // Method that prints the place/duration of the workers' break
  @Override
  public void takeBreak() {
    System.out.println(getName() + " takes a break in the Office breakout area for 40 min");
  }
}
