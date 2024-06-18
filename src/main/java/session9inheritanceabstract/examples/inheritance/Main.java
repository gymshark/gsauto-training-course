package session9inheritanceabstract.examples.inheritance;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Fred");
        Cat cat = new Cat("Bobby");

        dog.run(15);
        cat.run(20);
        dog.setCollarColour("Red");
        System.out.println(dog.getCollarColour());

        cat.hunt();
    }
}