package session12pageobjectinterfaces.tasks.akshatha;

public class Main {

  public static void main(String[] args) {
    IAnimal dog = new Animal.Dog();
    IAnimal cat = new Animal.Cat();

    System.out.println("Animal: " + dog.getSound());
    System.out.println("Animal: " + cat.getSound());
  }
}
