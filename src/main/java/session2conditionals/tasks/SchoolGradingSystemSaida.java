package session2conditionals.tasks;

public class SchoolGradingSystemSaida {

  public static void main(String[] args) {
    int score = 89;

    if (score < 60 && score >= 0) {
      System.out.println("Student's score is F");
    } else if (score >= 60 && score <= 69) {
      System.out.println("Student's score is D");
    } else if (score >= 70 && score <= 79) {
      System.out.println("Student's score is C");
    } else if (score >= 80 && score <= 89) {
      System.out.println("Student's score is B");
    } else if (score >= 90 && score <= 100) {
      System.out.println("Student's score is A");
    } else if (score < 0 || score > 100) {
      System.out.println("The entered value is invalid, please use range from 0 to 100");

    }
  }
}
