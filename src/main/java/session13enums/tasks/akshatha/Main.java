package session13enums.tasks.akshatha;

public class Main {

  public static void main(String[] args) {
    for (Direction direction : Direction.values()) {
      System.out.println("Each direction with description " + direction.getDescription());
    }
  }
}
