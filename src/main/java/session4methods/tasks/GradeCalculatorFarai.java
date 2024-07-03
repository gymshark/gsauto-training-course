package session4methods.tasks;

public class GradeCalculatorFarai {

  public static void main(String[] args) {

    int[] studentGrades = {59, 93, 57, 38, 69};

    System.out.println("The average grade is " + calculateAverageGrade(studentGrades));
  }

  public static double calculateAverageGrade(int[] studentGrades) {

    int sum = 0;

    for (int studentGrade : studentGrades) {

      sum += studentGrade;
    }

    return (double) sum / studentGrades.length;
  }
}