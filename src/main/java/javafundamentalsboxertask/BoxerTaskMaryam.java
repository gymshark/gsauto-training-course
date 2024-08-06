package javafundamentalsboxertask;

import java.util.Random;

public class BoxerTaskMaryam {

    public static void main(String[] args) {
        Random random = new Random(); // instance of the Random object
        int[] punches = new int [100];  // integer array called punches

        for (int i = 0; i < punches.length; i++) // c.	Loop through the array assigning random values from the Random nextInt met
        {

            punches[i] = random.nextInt(100) + 1; // values between 1 to 100

        }

        int boxerHealth = 1000;
        int punchesThrown = 0;

        // loop through punches

        for (int punchStrength : punches){

            punchesThrown++;
            boolean landed = checkPunchLanded(punchStrength);

            if (landed) {
                int effectiveStrength = punchStrength;
                if (punchStrength >= 90) {
                    System.out.println("Haymaker landed!");
                    effectiveStrength = Math.min(punchStrength * 2, 100);
                }
                System.out.println("Landed punch strength: " + effectiveStrength);
                boxerHealth -= effectiveStrength;

                if (boxerHealth <= 0) {
                    System.out.println("Knockout!");
                    System.out.println("Total punches thrown: " + punchesThrown);
                    return;
                }
            }
        }
        System.out.println("He's still standing after 100 punches!!!");
        System.out.println("Total punches thrown: " + punchesThrown);
    }

    // Method to check if the punch landed
    public static boolean checkPunchLanded(int punchStrength) {
        if (punchStrength % 5 == 0) {
            System.out.println("Punch landed!");
            return true;
        } else {
            System.out.println("Punch missed!");
            return false;
        }
    }
    }

