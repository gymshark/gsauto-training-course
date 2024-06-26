package session10overridingandoverloading.examples.methods;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Animal rex = new Dog();
    Animal felix = new Cat();
    Animal sammy = new Snake();
    Animal randomAnimal = new Animal();

    rex.makeSound();
    felix.makeSound();
    sammy.makeSound();
    randomAnimal.makeSound();

    List<Animal> zoo = new ArrayList<Animal>();
    zoo.add(rex);
    zoo.add(felix);
    zoo.add(sammy);
    zoo.add(randomAnimal);

    for (Animal animal : zoo) {
      animal.makeSound();
    }
  }
}
