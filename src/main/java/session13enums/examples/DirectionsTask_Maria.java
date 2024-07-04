package session13enums.examples;

public enum DirectionsTask_Maria {
    NORTH("This is the north direction"),
    SOUTH("This is the South direction"),
    EAST("This is the East direction"),
    WEST("This is the West direction");

    private final String description;


    DirectionsTask_Maria(String description) {
        this.description = description;

    }

    public static void main(String[] args) {
        DirectionsTask_Maria east = DirectionsTask_Maria.EAST;
        DirectionsTask_Maria north = DirectionsTask_Maria.NORTH;

        east.directionDescription();
        north.directionDescription();
    }

    public String directionDescription() {
        System.out.println("Direction -   " + description);
        return description;
    }
}
