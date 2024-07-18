package javafundamentalsboxertask;

import java.util.Random;

public class BoxerTaskKodi {

  // boolean Method to check if the punch landed
  public static boolean punchLanded(int punchPower) {
    return punchPower % 5 == 0;
  }

  public static void main(String[] args) {


    // Generate random number
    Random rand = new Random();
    int[] punches = new int[100];

    // set up the integer Array FOR loop
    for (int i = 0; i < punches.length; i++) {
      punches[i] = rand.nextInt(100) + 1;
    }

    // hitpoints for opponent set to 1000 outside of the loop
    int hitpoints = 1000;

    for (int a = 1; a <= punches.length; a++) {

    int punchPower = punches[a];
      // Pickup random punch from array
      String[] typeOfPunch =
        {"* Jab *",
          "* Straight Right *",
          "* Left Hook *",
          "* Right Hook *",
          "* Left Uppercut *",
          "* Right Uppercut *",
          "* Left Body Shot *",
          "* Right Body Shot *",
          "* Overhand Right *",
          "* Screw Shot *"
        };
      Random randomPunch = new Random();
      int index = randomPunch.nextInt(typeOfPunch.length);

      // Print out variables punch power and punch number
      System.out.println("Punch Number: " + a + " | Punch Power: " + punchPower);

      // If punch power a multiple of 5 then its a punch landed if punch power is 90 then its at double strength // nested IF Statement
      boolean punchLanded = punchLanded(punchPower);
      if (punchLanded) {
        if (punchPower >= 90) {
          System.out.println(typeOfPunch[index]);
          hitpoints = hitpoints - punchPower * 2;
          System.out.println("Haymaker Landed! (Doubled): " + punchPower * 2 + "\r\n" + "Current Health: " + hitpoints + "\r\n");
        } else {
          System.out.println(typeOfPunch[index]);
          hitpoints = hitpoints - punchPower;
          System.out.println("Punch Landed!: " + punchPower + "\r\n" + "Current Health: " + hitpoints + "\r\n");
        }
      }
      // Punch Missed if values above arent met
      else {
        System.out.println(typeOfPunch[index]);
        System.out.println("Punch Missed" + "\r\n");
      }

      // Check opponents health
      if (hitpoints > 0 && a == 100) {
        System.out.println("****** He's still standing after 100 punches!!! ******");
        break;
      } else if (hitpoints <= 0) {
        System.out.println("****** Its a Knockout!!! Fights over!! ******");
        break;
      }
    }
  }
}