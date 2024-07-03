package session11pageobjectinterfaces.examples.AnimalTestMaria;

public class Animal {


    private final IAnimal activeAnimal;


    public Animal() {
        this.activeAnimal = new Dog();
    }


    public String getSound() {
        this.activeAnimal.getSound();
        return activeAnimal.getSound();
    }

    public static class Dog implements IAnimal {

        String sound = "Woof";

        @Override
        public String getSound() {
            System.out.println("Dog makes the sound -  " + sound);
            return sound;
        }
    }

    public static class Cat implements IAnimal {
        String sound = "Meow";

        @Override
        public String getSound() {
            System.out.println("Cat makes the sound -" + sound);
            return sound;
        }
    }


}
