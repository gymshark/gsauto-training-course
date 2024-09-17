package session2conditionals.tasks;

public class SchoolGradingSystemAkshatha {
    public static void main(String[] args) {
        int score = 72;
        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("Grade is A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Grade is B ");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade is C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Grade is D");
            } else {
                System.out.println("Grade is F");
            }
        } else {
            System.out.println("Score is not between 0 and 100");
        }
    }
}
