package session4methods.tasks;

public class GradeCalculatorKodi {

  public static double calculateAverageGrade(int[] grades) {

    double total = 0;
    for (double grade : grades) {
      total += grade;
    }
    return total / grades.length;
  }

  public static void main(String[] args) {

    int[] studentGrades = {100, 89, 98, 55, 90, 45, 75, 64, 59};
    double averageGrade = calculateAverageGrade(studentGrades);

    System.out.println("Average grade is: " + averageGrade);
  }
}