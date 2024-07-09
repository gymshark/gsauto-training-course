package session13enums.examples;

import java.util.ArrayList;

public class EnumTest {

    public static void main(String[] args) {

        DirectionsFatima south = DirectionsFatima.SOUTH;
        DirectionsFatima north = DirectionsFatima.NORTH;
        DirectionsFatima east = DirectionsFatima.EAST;
        DirectionsFatima west = DirectionsFatima.WEST;

/*
implementation before PR comments
south.descriptionOfDirection();
north.descriptionOfDirection();
east.descriptionOfDirection();
west.descriptionOfDirection(); */

        ArrayList<DirectionsFatima> direction = new ArrayList<>();
        direction.add(DirectionsFatima.EAST);
        direction.add(DirectionsFatima.SOUTH);
        direction.add(DirectionsFatima.WEST);
        direction.add(DirectionsFatima.NORTH);

        for (DirectionsFatima directionsFatima : direction) {
            System.out.println("Direction: " + directionsFatima);
        }
    }
}