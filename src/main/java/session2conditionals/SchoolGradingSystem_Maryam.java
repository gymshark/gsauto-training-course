package session2conditionals;

public class SchoolGradingSystem_Maryam {

  public static void main(String[] args) {
    int score = 56;
    if (score < 0 || score > 100)
      System.out.println("Not a valid number");
    else {
      if (score >= 90 && score <= 100) {
        System.out.println("Grade A");
      } else if (score >= 80 && score <= 89) {
        System.out.println("Grade B");
      } else if (score >= 70 && score <= 79) {
        System.out.println("Grade C");
      } else if (score >= 60 && score <= 69) {
        System.out.println("Grade D");
      } else if (score < 60) {
        System.out.println("Grade F");
      }
    }


  }

}
