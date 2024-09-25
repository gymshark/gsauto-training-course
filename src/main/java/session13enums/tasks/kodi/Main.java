package session13enums.tasks.kodi;

public class Main {

  public static void main(String[] args) {
    for (Direction direction : Direction.values()) {
      System.out.println(direction.name() + " : " + direction.getDescription());
    }
  }
}
