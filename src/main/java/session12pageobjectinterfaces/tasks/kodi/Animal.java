package session12pageobjectinterfaces.tasks.kodi;

public class Animal implements IAnimal {

  @Override
  public String getSound() {
    return "Default sound";
  }

  public static class Dog extends Animal {

    @Override
    public String getSound() {
      return "Woof";
    }
  }

  public static class Cat extends Animal {

    @Override
    public String getSound() {
      return "Meow";
    }
  }
}





