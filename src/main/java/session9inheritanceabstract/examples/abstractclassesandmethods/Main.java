package session9inheritanceabstract.examples.abstractclassesandmethods;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Tutor darrell = new Tutor("Darrell");
    Employee kodi = new Employee("Kodi", 35);
    Employee maryam = new Employee("Maryam", 21);

    List<Person> attendees = Arrays.asList(darrell, kodi, maryam);

    for (Person person : attendees) {
      System.out.println(person.register());
      System.out.println(person.getName() + "current salary = " + person.calculateSalary(99999.99d, 35));
    }
    darrell.setWeight(100000000);
  }
}