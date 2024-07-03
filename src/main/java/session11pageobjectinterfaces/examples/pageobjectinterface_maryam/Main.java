package session11pageobjectinterfaces.examples.pageobjectinterface_maryam;

public class Main {
    public static void main(String[] args) {

        IAnimalInterface dog = new Dog();
        IAnimalInterface cat = new Cat();

        System.out.println("Dog Sound" + " " + dog.getSound());
        System.out.println("Cat Sound" + " " + cat.getSound());



    }
}

