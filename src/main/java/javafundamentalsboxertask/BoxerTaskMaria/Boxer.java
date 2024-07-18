package javafundamentalsboxertask.BoxerTaskMaria;


public class Boxer {
    //  Boxer box ;
    Player player = new Player();
    private String boxerName;
    private int initialHitPoints;

    //Boxer class Constructor
    public Boxer(int initialHitPoints, String boxerName) {
        this.initialHitPoints = initialHitPoints;
        this.boxerName = boxerName;

    }

    /**
     * Method simulating the boxer's rounds checking punches .
     *
     * @param initialHitPoints
     * @param box
     * @return
     */
    public int boxerRound(int initialHitPoints, Boxer box) {
        System.out.println("Boxer's Round");
        for (int i = 1; i <= 100; i += 1) {
            if (player.punch(box)) {
                initialHitPoints--;
            }
        }
        System.out.println("Final Remaining Boxer hit points - " + initialHitPoints);
        if (initialHitPoints == 0) {
            System.out.println("Game Over ,end ");
        }
        return initialHitPoints;
    }


    /**
     * Method to check if boxer is knocked out - if no hit points left
     */
    public boolean isKnockOut() {
        if (initialHitPoints <= 0) {
            System.out.println("Boxer - " + boxerName + " KnockOut");
            return true;
        } else {
            System.out.println(boxerName + " is still standing after a 100 punches");
        }
        return false;
    }


    public void takePunch(int damage) {
        if (player.punchLanded(2)) {
            System.out.println("Boxer received a punch");
        }

    }
}

