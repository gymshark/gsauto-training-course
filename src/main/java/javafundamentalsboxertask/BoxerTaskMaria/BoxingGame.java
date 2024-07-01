package javafundamentalsboxertask.BoxerTaskMaria;


public class BoxingGame {
    public static void main(String args[]) {


        Player p1 = new Player();
        System.out.println("Player's Round");
        System.out.println("Punch Strength of each landed punch = " + p1.getPunchStrength());  // Print out the strength of each landed punch
        System.out.println("Total number of Punches landed =" + p1.getNoOfPunchesLanded());  //Print out the amount of Player's punches thrown  before ending


        System.out.println("Total number of Missed Punches - " + p1.getNoOfMissedPunches()); //Player's missed punches count
        System.out.println("Total number of punches used - " + p1.getTotalNoOfPunchesUsed()); // Player's total number of punches used

        System.out.println("******************************");
        System.out.println("Boxer's Round");

        Boxer box1 = new Boxer(100, "Luke", 77);

        box1.isKnockOut(); // Call Knockout method


    }

}

