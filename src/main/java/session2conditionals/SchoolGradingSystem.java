package session2conditionals;

public class SchoolGradingSystem {
    public static void main(String[] args) {

        int score = 74;

        if (score >= 0 && score <= 100) {

            if (score >= 90 && score <= 100) {

                System.out.println("The student's grade is: A");

            } else if (score >= 80 && score < 90) {

                System.out.println("The student's grade is: B");

            } else if (score >= 70 && score < 80) {

                System.out.println("The student's grade is: C");

            } else if (score >= 60 && score < 70) {

                System.out.println("The student's grade is: D");

            } else {

                System.out.println("The student's grade is: F");
            }
        } else {
            System.out.println("The provided score is not within the range of 0 to 100.");
        }
    }
}
