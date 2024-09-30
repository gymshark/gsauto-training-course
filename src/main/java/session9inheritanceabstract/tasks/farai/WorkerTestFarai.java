package session9inheritanceabstract.tasks.farai;

public class WorkerTestFarai {

  public static void main(String[] args) {

    WorkerFarai officeWorker = new OfficeWorkerFarai("Fatima", "Brand");
    WorkerFarai factoryWorker = new FactoryWorkerFarai("Owyn", "Metallurgy");
    WorkerFarai remoteWorker = new RemoteWorkerFarai("Vix", "Tech");

    officeWorker.displayInfo();
    officeWorker.work();
    officeWorker.takeBreak();
    System.out.println();

    factoryWorker.displayInfo();
    factoryWorker.work();
    factoryWorker.takeBreak();
    System.out.println();

    remoteWorker.displayInfo();
    remoteWorker.work();
    remoteWorker.takeBreak();
    System.out.println();
  }
}
