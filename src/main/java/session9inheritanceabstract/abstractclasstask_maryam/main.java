package session9inheritanceabstract.abstractclasstask_maryam;

public class main {
    public static void main(String[] args) {
        worker officeworker = new OfficeWorker("Maryam",  "IT");
        worker factoryworker = new FactoryWorker("Ali" , "Manufacturing");
        worker remoteworker = new RemoteWorker("Zara" , "Design");

        // display info for office worker
        officeworker.workerinformation();
        officeworker.work();
        officeworker.takeBreak();
        System.out.println();

        // display info for factory worker
        factoryworker.workerinformation();
        factoryworker.work();
        factoryworker.takeBreak();
        System.out.println();

        // display info for remote worker
        remoteworker.workerinformation();
        remoteworker.work();
        remoteworker.takeBreak();
        System.out.println();
    }
}
