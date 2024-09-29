package session4methods.tasks;

public class AverageGradeCalculatorAkshatha {

  public static void main(String[] args) {
    int[] grades = {6, 7, 8, 7, 8, 9, 9};
    System.out.println("The average grade is: " + calculateAverageGrade(grades));
  }


  public static double calculateAverageGrade(int[] grades) {
    int totalGrades = 0;
    for (int studentGrade : grades) {
      totalGrades += studentGrade;
    }
    return (double) totalGrades / grades.length;
  }
}
