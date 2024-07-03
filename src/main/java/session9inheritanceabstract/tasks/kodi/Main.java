package session9inheritanceabstract.tasks.kodi;

public class Main {
  public static void main(String[] args) {
    OfficeWorker officeWorker = new OfficeWorker("Terence Crawford", "Marketing");
    FactoryWorker factoryWorker = new FactoryWorker("Kodi-Lee Johnson", "Machine Shop");
    RemoteWorker remoteWorker = new RemoteWorker("Miguel Cotto", "Engineering/QA");

    officeWorker.displayWorkerInfo();
    officeWorker.work();
    officeWorker.takeBreak();

    System.out.println();

    factoryWorker.displayWorkerInfo();
    factoryWorker.work();
    factoryWorker.takeBreak();

    System.out.println();

    remoteWorker.displayWorkerInfo();
    remoteWorker.work();
    remoteWorker.takeBreak();
  }
}
