package session4methods.tasks;

public class GradeCalculatorMaryam {
    // method to calculate the average of the values in array grades
    public static double calculateAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;

        }
        return  sum / grades.length;
    }
    //main method
    public static void main(String[] args)
    {
        int [] grades = {20, 30, 49, 50, 89, 38};
        double averageGrade = calculateAverageGrade(grades);

        System.out.println("Average Grades of all studesnts is:" + averageGrade);

    }


}

