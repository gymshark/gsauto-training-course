package session2conditionals.tasks;

public class SchoolGradingSystemAkeem {

    public static void main(String[] args) {

        int score = 62;
        if (score > 90 && score <= 100) {
            System.out.println("A: " + score);
        } else if (score > 80 && score <= 89) {
            System.out.println("B: " + score);
        } else if (score > 70 && score <= 79) {
            System.out.println("C: " + score);
        } else if (score > 60 && score <= 69) {
            System.out.println("D: " +score);
        } else if (score < 60) {
            System.out.println("F: " + score);
        } else if (score < 0 || score > 100){
            System.out.println("Score is not within 0-100 range");
        }
    }
}
