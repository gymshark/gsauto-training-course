package javafundamentalsboxertask.BoxerTaskMaria;


public class BoxingGame {

  public static void main(String args[]) {


    Player p1 = new Player();
    System.out.println("Player's Round");
    p1.printPunchStrength(); //Prints the Player's punch strength for each punch

    System.out.println("Punch Strength of  landed punch = " + p1.getPunchStrength());  // Print out the strength of only landed punches
    System.out.println("Total number of Punches landed =" + p1.getNoOfPunchesLanded());  // Player's landed punches count

    System.out.println("Total number of Missed Punches - " + p1.getNoOfMissedPunches()); //Player's missed punches count

    System.out.println("Total number of punches used before game was over - " + p1.getTotalNoOfPunchesUsed()); //Print out the amount of Player's
    // punches thrown  before ending

    System.out.println("******************************");
    System.out.println("Boxer's Round");

    Boxer box1 = new Boxer(5, "Luke");

    box1.isKnockOut();

    box1.takePunch(5);

  }

}



