package session12pageobjectinterfaces.tasks.maria;

public class Main {

    public static void main(String[] args) {
        Animal currentAnimal = new Animal();
        String sound = currentAnimal.getSound();

        if (sound == "Woof") {
            System.out.println("Current animal is a Dog");
        } else if (sound == "Meow") {
            System.out.println("Current animal is a Cat");

        }

    }
}
