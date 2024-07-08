package session12pageobjectinterfaces.tasks.kodi;

public class Main {

  public static void main(String[] args) {

    // Dog should return "Woof" as its sound
    // Cat should return "Meow" as its sound

    IAnimal dog = new Animal.Dog();
    IAnimal cat = new Animal.Cat();

    System.out.println("The sound a dog makes is: " + dog.getSound());
    System.out.println("The sound a cat makes is: " + cat.getSound());

  }
}
