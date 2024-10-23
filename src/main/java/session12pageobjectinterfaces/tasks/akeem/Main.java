package session12pageobjectinterfaces.tasks.akeem;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Dog dog = new Animal.Dog();
        Animal.Cat cat = new Animal.Cat();

        System.out.println(animal.getSound());
        System.out.println(dog.getSound());
        System.out.println(cat.getSound());
    }
}
