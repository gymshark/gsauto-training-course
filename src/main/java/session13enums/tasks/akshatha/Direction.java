package session13enums.tasks.akshatha;

public enum Direction {
  NORTH("Towards North"),
  SOUTH("Towards South"),
  EAST("Towards East"),
  WEST("Towards West");

  public final String description;

  Direction(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}


