package session13enums.examples.kodi;

public enum Direction {

  NORTH("North Side is the best!"),
  SOUTH("South Side is the best!"),
  EAST("East Side is the best!"),
  WEST("West Side is the best!");

  public final String description;


  Direction(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
