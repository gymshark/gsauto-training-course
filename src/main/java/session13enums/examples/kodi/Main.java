package session13enums.examples.kodi;

public class Main {

  public static void main(String[] args) {
    for (Direction direction : Direction.values()) {
      System.out.println(direction.getDescription());
    }
  }
}
