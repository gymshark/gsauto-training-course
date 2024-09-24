package javafundamentalsboxertask.BoxerTaskMaria;

import java.util.Random;

public class Player {

  private final int[] punches = new int[100]; // Integer array of 100 punches
  // Player Class
  Random rand = new Random();  //Create an instance of the Random Object
  private int noOfPunchesLanded; // No of punches landed (including Double strength)
  private int noOfMissedPunches; // No of punches missed
  private int totalNoOfPunchesUsed; // Total  number of punches used by Player
  private int punchStrength; // Punch strength of each punch


  public Player() {
//Constructor
  }

  public void printPunchStrength() {
    for (int i = 0; i < punches.length; i++) {
      punches[i] = rand.nextInt(100) + 1;
      punchStrength = punches[i];
      System.out.println("Punch strength of this punch - " + punchStrength);
      punchLanded(punchStrength);
    }
  }

  //Getter Methods
  public int getNoOfMissedPunches() {
    return noOfMissedPunches;
  }

  public int getTotalNoOfPunchesUsed() {
    return totalNoOfPunchesUsed;
  }


  public int getNoOfPunchesLanded() {
    return noOfPunchesLanded;
  }

  public int getPunchStrength() {

    return punchStrength;
  }

  /**
   * Method punchLanded()  checks if the  punch strength is a multiple of 5 If yes, then the punch connects If the punch strength is also > 90 then it
   * is a Double strength Punch Else it is a missed punch
   */
  public boolean punchLanded(int punchStrength) {
    if (punchStrength > 0) {
      if (punchStrength <= 90 & (punchStrength % 5 == 0)) {
        System.out.println("Punch Landed");
        noOfPunchesLanded += 1;

      } else if ((punchStrength >= 90) & (punchStrength % 5 == 0)) {
        System.out.println("HayMaker Landed");
        System.out.println("Punch strength of the Haymaker -" + punchStrength);
        noOfPunchesLanded += 1;
      } else {
        System.out.println("Punch Missed");
        noOfMissedPunches += 1;
      }
      totalNoOfPunchesUsed = noOfMissedPunches + noOfPunchesLanded; // Total no of punches used by Player
    }
    return false;

  }

  //Method for Player punch logic
  public boolean punch(Boxer opponent) {
    for (int punchStrength : punches) {
      System.out.println("Punch Strength = " + punchStrength);
      if (punchLanded(punchStrength)) {
        int damage = punchStrength >= 90 ? punchStrength * 2 : punchStrength;
        opponent.takePunch(damage);
      }
    }
    return false;
  }


}










