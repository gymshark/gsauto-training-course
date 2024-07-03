package session4methods.tasks;

public class GradeCalculatorFatima {
    public static void main(String[] args) {
        int[] grades = {56,78,99,98,45};
        System.out.println(calculateAverageGrade(grades));
    }

    public static double calculateAverageGrade ( int[] grades){
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
        sum += grades[i];
    }
        return (double) sum / grades.length;
    }
}


