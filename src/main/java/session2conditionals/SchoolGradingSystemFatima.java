package session2conditionals;

public class SchoolGradingSystemFatima {
    

    public static void main(String[] args) {
        int score = 98;

        if (score < 60) {
            System.out.println("Your score is F");
        } else if (score > 60 && score < 70) {
            System.out.println("Your score is D");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your score is C");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your score is B");
        } else if (score >= 90) {
            System.out.println("Your score is A");
        }

        System.out.println(score);
    }
}
