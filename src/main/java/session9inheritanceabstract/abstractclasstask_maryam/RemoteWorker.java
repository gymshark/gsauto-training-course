package session9inheritanceabstract.abstractclasstask_maryam;

public class RemoteWorker extends  worker {

    public RemoteWorker (String name , String department){
        super(name, department);
    }

    @Override
    public void work() {
        System.out.println(name + " is working remotely for the next 3 weeks");

    }

    @Override
    public void takeBreak() {
        System.out.println(name + " will take a lunch break of 1.5 hours while working remote");
    }
}
