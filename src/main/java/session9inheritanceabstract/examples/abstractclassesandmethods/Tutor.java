package session9inheritanceabstract.examples.abstractclassesandmethods;

public class Tutor extends Person {

  public Tutor(String name) {
    super(name);
  }

  @Override
  String register() {
    return super.getName() + " has prepared the course materials and is presenting";
  }
}
