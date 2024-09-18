package javafundamentalsboxertask;

import java.util.Random;

public class BoxingGameAkshatha {

  public static void main(String[] args) {
    Random random = new Random();
    int[] punches = new int[100];
    for (int i = 0; i < punches.length; i++) {
      punches[i] = random.nextInt(100) + 1;
    }

    int boxerHealth = 1000;
    int punchCount = 0;

    for (int punch : punches) {
      punchCount++;
      int punchStrength = punch;

      if (punchLands(punchStrength)) {
        if (punchStrength >= 90) {
          punchStrength *= 2;
          System.out.println("Haymaker landed! Strength: " + punchStrength);
        } else {
          System.out.println("Punch landed! Strength: " + punchStrength);
        }
        boxerHealth -= punchStrength;

        if (boxerHealth <= 0) {
          System.out.println("Knockout!");
          System.out.println("Total punches thrown: " + punchCount);
          return;
        }
      } else {
        System.out.println("Punch missed!");
      }
    }

    System.out.println("He's still standing after 100 punches!!!");
    System.out.println("Total punches thrown: " + punchCount);
  }

  private static boolean punchLands(int punchStrength) {
    boolean lands = (punchStrength % 5 == 0);
    if (lands) {
      System.out.println("Punch landed!");
    }
    return lands;
  }
}


