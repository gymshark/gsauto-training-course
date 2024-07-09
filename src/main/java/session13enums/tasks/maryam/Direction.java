package session13enums.tasks.maryam;

public enum Direction {

    North("Manchester is north of England"),
    South("London is south of England"),
    East ("Berdfordshire is East of Enland"),
    West("Bath (Somerset) is in West of England");

    // direction field
    private final String direction;

    // constructor
    Direction(String direction){
        this.direction = direction;
    }

    //method
    public String getDirection() {

        return direction;
    }



}
