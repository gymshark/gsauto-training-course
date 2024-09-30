package session2conditionals.tasks;

public class SchoolGradingSystemMaria {

  public static void main(String[] args) {

// Hardcode student score

    int score = 98778;

//Determine grades based on scoring range

    if (score >= 0 && score <= 100) {
      if (score >= 90) {
        System.out.println("Grade - A ");
      } else if (score >= 80) {
        System.out.println("Grade - B ");
      } else if (score >= 70) {
        System.out.println("Grade - C ");
      } else if (score >= 60) {
        System.out.println("Grade - D ");
      } else {
        System.out.println("Grade - F");
      }
    } else {
      //Throws an exception for scores other than (0 - 100)
      throw new IndexOutOfBoundsException("Invalid range, enter a number of 0 and 100");
    }
  }
}
