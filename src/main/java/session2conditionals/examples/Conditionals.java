package session2conditionals.examples;

public class Conditionals {

  public static void main(String[] args) {
    double hourlyRate = 15.50;
    int hoursWorked = 38;
    int regularContractedHours = 40;
    double salary;

    if (hoursWorked > regularContractedHours) {
      System.out.println("Calculating overtime pay");
      int overtimeHours = hoursWorked - regularContractedHours;
      double overtimeRate = hourlyRate * 1.5;
      salary = (overtimeRate * overtimeHours) + (regularContractedHours * hourlyRate);
    } else {
      System.out.println("Calculating standard pay");
      salary = regularContractedHours * hourlyRate;
    }
    System.out.println("Salary is: " + salary);
  }

}
