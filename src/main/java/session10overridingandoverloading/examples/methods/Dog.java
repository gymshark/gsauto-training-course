package session10overridingandoverloading.examples.methods;

public class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Dog says 'WOOF'");
  }
}
