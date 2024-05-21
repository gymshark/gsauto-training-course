package session2conditionals;

public class SchoolGradingSystemMaria {
    public static void main(String[] args) {

// Hardcode student score

        int score = 56;
//Determine grades based on scoring range
        if (score >= 90 && score <= 100) {
            System.out.println("Grade - A ");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade - B ");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade - C ");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade - D ");
        } else if (score < 60 && score >= 0) {
            System.out.println("Grade - F");
        }
        // Validation to ensure the score is within a 0-100 range.

        if (score <= 0 || score >= 100) {
            throw new IndexOutOfBoundsException(" Invalid Scoring range , Please enter a score between 0 and 100");
        }
    }
}
