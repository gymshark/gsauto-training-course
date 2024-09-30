package session4methods.tasks;

public class GradeCalculatorSaida {
    public static double calculateAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        int[] grades = {89, 54, 99, 76};
        System.out.println("The average grade of students is " + calculateAverageGrade(grades));
    }

}

