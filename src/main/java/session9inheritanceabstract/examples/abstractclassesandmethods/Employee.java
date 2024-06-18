package session9inheritanceabstract.examples.abstractclassesandmethods;

public class Employee extends Person {
    private String title;

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    String register() {
        return super.getName() + " has registered for the course";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
