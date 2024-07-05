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

        for (DirectionsTask_Maria direction : DirectionsTask_Maria.values()) {
            System.out.println("The directions are - " + direction);

        }

    }

    public String directionDescription() {
        System.out.println("Direction -   " + description);
        return description;
    }
}
