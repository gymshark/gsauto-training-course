package session13enums.tasks.fatima;

public enum DirectionsFatima {
  NORTH("North"),
  SOUTH("South"),
  EAST("East"),
  WEST("West");

  private final String description;

  DirectionsFatima(String description) {
    this.description = description;
  }

  public void descriptionOfDirection() {
    System.out.println("Current direction is: " + description);
  }

}
