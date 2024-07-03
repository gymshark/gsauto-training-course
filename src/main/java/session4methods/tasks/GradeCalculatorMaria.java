package session4methods.tasks;

public class GradeCalculatorMaria {

    //Method Declaration - a method that takes an integer array of grades  as a  parameter
    public static double calculateAverageGrade(int[] studentGrades) {
        int sumOfStudentGrades = 0;
        //Calculate the sum of all grades in the integer array
        for (int studentGrade : studentGrades) {
            sumOfStudentGrades += studentGrade;
        }
        //Calculate the average grade and return this as a double
        double averageStudentGrade = sumOfStudentGrades / studentGrades.length;
        return averageStudentGrade;
    }

    public static void main(String[] args) {
        int[] studentGrades = {34, 56, 56, 78, 89, 90};
        //Print the average grade by calling the method calculateAverageGrade()
        System.out.println("Average student grade is - " + calculateAverageGrade(studentGrades));
    }
}
