package session9inheritanceabstract.tasks.fatima;

public class MainFatima {

  public static void main(String[] args) {
    OfficeWorkerFatima officeWorker = new OfficeWorkerFatima("Scott", "HR");
    FactoryWorkerFatima factoryWorker = new FactoryWorkerFatima("Fred", "Machinery");
    RemoteWorkerFatima remoteWorker = new RemoteWorkerFatima("Jean", "IT");

    System.out.println(officeWorker.displayBasicInformation());
    System.out.println(factoryWorker.displayBasicInformation());
    System.out.println(remoteWorker.displayBasicInformation());

    officeWorker.work();
    officeWorker.takeBreak();

    factoryWorker.work();
    factoryWorker.takeBreak();

    remoteWorker.work();
    remoteWorker.takeBreak();

  }
}
