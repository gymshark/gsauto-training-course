package javafundamentalsboxertask.BoxerTaskMaria;

public class Boxer {

    //Opponent Boxer class with fields - Name, Initial and remaining Hit points
    private String boxerName;
    private int initialHitPoints;
    private int remainingHitPoints;

    //Boxer class Constructor
    public Boxer(int initialHitPoints, String boxerName, int remainingHitPoints) {
        this.initialHitPoints = initialHitPoints;
        this.boxerName = boxerName;
        System.out.println("Boxer's Round");
        for (int i = 1; i <= 100; i += 1) {
            initialHitPoints--;
            remainingHitPoints = initialHitPoints;
            System.out.println("Remaining Boxer hit points - " + remainingHitPoints);
        }
    }

    //Getter methods
    public int getInitialHitPoints() {
        return initialHitPoints;
    }

    public int getRemainingHitPoints() {
        return remainingHitPoints;
    }


    /**
     * Method to check if Opponent Boxer is knocked out - when no hit points left
     */
    public boolean isKnockOut() {
        if (remainingHitPoints <= 0) {
            System.out.println("Boxer - " + boxerName + " KnockOut");
            return true;
        } else {
            System.out.println(boxerName + " is still standing after a 100 punches");
        }
        return false;
    }
}