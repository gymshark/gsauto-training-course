package session13enums.tasks.akeem;

public class Main {
    public static void main(String[] args) {
        getDirections();
    }

    public static void getDirections() {
        for (Direction direction : Direction.values()) {
            System.out.println(direction + direction.getDescription());
        }
    }
}
