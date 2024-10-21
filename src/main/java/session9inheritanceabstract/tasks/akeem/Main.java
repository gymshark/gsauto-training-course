package session9inheritanceabstract.tasks.akeem;

public class Main {
    public static void main(String[] args) {
        FactoryWorker factoryWorker1 = new FactoryWorker("Carlos", "Merchandising");
        OfficeWorker officeWorker1 = new OfficeWorker("Sarah", "Human Resources");
        RemoteWorker remoteWorker1 = new RemoteWorker("Rob", "Tech");

        System.out.println(factoryWorker1.basicWorkerInfo());
        factoryWorker1.work();
        factoryWorker1.takeBreak();
        System.out.println();

        System.out.println(officeWorker1.basicWorkerInfo());
        officeWorker1.work();
        officeWorker1.takeBreak();
        System.out.println();

        System.out.println(remoteWorker1.basicWorkerInfo());
        remoteWorker1.work();
        remoteWorker1.takeBreak();
    }
}
