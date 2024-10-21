package session13enums.tasks.akeem;

public enum Direction {
    NORTH("(N)"), EAST("(E)"), SOUTH("(S)"), WEST("(W)");

    public final String description;

    Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
