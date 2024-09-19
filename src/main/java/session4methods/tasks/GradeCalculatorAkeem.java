package session4methods.tasks;

public class GradeCalculatorAkeem {

    public static void main(String[] args) {
        int[] grades = {100, 45, 32, 84, 61, 92, 56};
        System.out.println("Average grade is: " + calculateAverageGrade(grades));
    }

    public static double calculateAverageGrade(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
