package javafundamentalsboxertask;

import java.util.Random;

public class BoxerTaskFatima {

    public static void main(String[] args) {

        int boxerHealthPoints = 1000;
        int[] punches = new int[100];

        Random random = new Random();

        for (int i = 0; i < punches.length; i++) {
            random.nextInt(100);
            if (random.nextInt() % 5 == 0) {
                System.out.println("Punch Landed!");
                boxerHealthPoints -= random.nextInt();
            } else if (random.nextInt() >= 90 || random.nextInt() <100) {
                System.out.println("Haymaker Landed!");
                boxerHealthPoints -= random.nextInt();
            } else System.out.println("Punch Missed!");
        }

        if (boxerHealthPoints > 0) {
            System.out.println("He's still standing after 100 punches!");
        } else if (boxerHealthPoints == 0) {
            System.out.println("Knockout");
            System.exit(0);
        }
    }
}











