package session10overridingandoverloading.examples.methods;

public class Snake extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Snake says 'Hissss!'");
  }
}
