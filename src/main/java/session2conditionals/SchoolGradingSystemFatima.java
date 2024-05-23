package session2conditionals;

public class SchoolGradingSystemFatima {

    //2.	Program Description:
    //1.	Hardcode a student's score. E.g. int score = 56
    //2.	Based on the score, print out the corresponding grade category:
    //1.	A: 90 to 100
    //2.	B: 80 to 89
    //3.	C: 70 to 79
    //4.	D: 60 to 69
    //5.	F: Below 60
    //3.	Include validation to ensure the score is within a 0-100 range.

    public static void main(String[] args) {
        int score = 65;

        if (score < 60) {
            System.out.println("Your score is a F");
        } else if (score > 60 && score < 70) {
            System.out.println("Your score is a D");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your score is a C");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your score is a B");
        } else if (score >= 90) {
            System.out.println("Your score is a A");
        }

        System.out.println(score);

    }
}
