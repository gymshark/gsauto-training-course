package javafundamentalsboxertask;

import java.util.Random;

public class BoxerTaskFatima {
    public static void main(String[] args) {

        Random random = new Random();
        int[] playerPunches = new int[100];
        int boxerHealthPoints = 1000;

        for (int i = 0; i < playerPunches.length; i++) {
            playerPunches[i] = random.nextInt(100) + 1;
            int punchStrength = playerPunches[i];
            System.out.println("Punch Strength:" + punchStrength);

            if (punchStrength % 5 == 0) {
                if (punchStrength >= 90) {
                    System.out.println("Haymaker Landed!");
                    boxerHealthPoints -= punchStrength * 2;
                    System.out.println("Damage: " + (punchStrength * 2) + " | Boxer Health: " + boxerHealthPoints);
                } else {
                    System.out.println("Punch Landed!");
                    boxerHealthPoints -= punchStrength;
                    System.out.println("Damage: " + punchStrength + " | Boxer Health: " + boxerHealthPoints);
                }
            } else {
                System.out.println("Punch Missed!");
            }

            if (boxerHealthPoints <= 0) {
                System.out.println("Knockout");
                break;
            }
        }

        if (boxerHealthPoints > 0) {
            System.out.println("He's still standing after 100 punches!");
        }


    }
}










