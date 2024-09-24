package session12pageobjectinterfaces.tasks.akshatha;

public abstract class Animal implements IAnimal {

  @Override
  public String getSound() {
    return "Animal noise";
  }

  public static class Dog extends Animal {

    @Override
    public String getSound() {
      return "Dog says woof";
    }
  }

  public static class Cat extends Animal {

    @Override
    public String getSound() {
      return "Cat says meow";
    }
  }
}
