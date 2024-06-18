package session9inheritanceabstract.examples.abstractclassesandmethods;

public abstract class Person extends Mammal {
    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary(double hourly, int hours) {
        return hours * hourly;
    }

    abstract String register();
}
