package session6classes.examples;

// Define a class called Person
public class Person {

  // Fields (Attributes)
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Setter for age
  public void setAge(int age) {
    this.age = age;
  }

  // Method to display person's details
  public void displayDetails() {
    System.out.println("Name: " + name + ", Age: " + age);
  }

  public static void main(String[] args) {
    // Creating objects of Person class
    Person person1 = new Person("Alice", 30);
    Person person2 = new Person("Bob", 25);

    // Displaying initial details
    person1.displayDetails();
    person2.displayDetails();

    // Modifying object properties using setters
    person1.setName("Alice Smith");
    person1.setAge(31);

    // Displaying modified details
    person1.displayDetails();
  }
}

