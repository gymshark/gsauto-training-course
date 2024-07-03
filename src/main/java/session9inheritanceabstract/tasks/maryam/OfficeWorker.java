package session9inheritanceabstract.tasks.maryam;

public class OfficeWorker extends Worker{

    public OfficeWorker(String name, String department) {
        super(name, department);
    }
    @Override

    public void work(){
        System.out.println( name + " is priniting out papers from the printer ");
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " is taking a lunch break at 1pm");
    }
}
