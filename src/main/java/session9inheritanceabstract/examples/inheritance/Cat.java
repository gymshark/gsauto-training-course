package session9inheritanceabstract.examples.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void hunt() {
        super.run(10);
        System.out.println("Cat has found its prey");
    }
}
