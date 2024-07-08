package session12enums.examples.enumtask_maryam;

public class Direction_Test {
    public static void main(String[] args) {
        for (Direction direction : Direction.values()) {
            System.out.println(direction.name() + ": " + direction.getDirection());
        }
    }


    // notes for myself
    // built in methods for enum in java are:
    // .name returns the name of the enum example here is (North)
    //.ordinal returns the position of enum constant starting from 0
    // .value return the value enum constant
    // valueOf Returns the enum constant of the specified enum type with the specified name

}
