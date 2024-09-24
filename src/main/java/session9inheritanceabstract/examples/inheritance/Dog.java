package session9inheritanceabstract.examples.inheritance;

public class Dog extends Animal {

  private String collarColour;

  public Dog(String name) {
    super(name);
  }

  public String getCollarColour() {
    return collarColour;
  }

  public void setCollarColour(String collarColour) {
    this.collarColour = collarColour;
  }
}
