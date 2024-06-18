package session9inheritanceabstract.examples.inheritance;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int km) {
        System.out.println(name + " is running " + km + " kilometres");
    }
}
