package session12pageobjectinterfaces.examples;

public class Animal {

  private final IAnimal activeAnimal;

  public Animal(){
    this.activeAnimal = new Cat();
  }

  public void makeSound() {
    this.activeAnimal.makeSound();
  }

  public void move(){
    this.activeAnimal.move();
  }

  interface IAnimal {
    void makeSound();
    void move();
  }

  private static class Dog implements IAnimal{

    @Override
    public void makeSound() {
      System.out.println("Dog says woof");
    }

    @Override
    public void move() {
      System.out.println("Dog runs");
    }
  }

  private static class Cat implements IAnimal{

    @Override
    public void makeSound() {
      System.out.println("Cat says meow");
    }

    @Override
    public void move() {
      System.out.println("Cat prowls");
    }
  }
}
