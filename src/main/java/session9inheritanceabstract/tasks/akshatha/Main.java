package session9inheritanceabstract.tasks.akshatha;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Worker officeWorker = new OfficeWorker("Tracey", "HR");
    Worker factoryWorker = new FactoryWorker("Chloe", "Production");
    Worker remoteWorker = new RemoteWorker("Iliana", "Marketing");
    
    List<Worker> workers = Arrays.asList(officeWorker, factoryWorker, remoteWorker);

    for (Worker worker : workers) {
      worker.displayBasicInfo();
      worker.work();
      worker.takeBreak();
      System.out.println();
    }
  }
}
