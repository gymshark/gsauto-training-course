package javafundamentalsboxertask;

import java.util.Random;

public class BoxerTaskFatima {

    public static void main(String[] args) {

        Random random = new Random();
        int[] playerPunches = new int[100];
        int boxerHealthPoints = 1000;
        boolean hasPunchLanded;

        for (int playerPunch : playerPunches) {
            System.out.println("Punch Strength:" + random.nextInt(100));
            if ((random.nextInt() % 5) == 0) {
                System.out.println("Punch Landed!");
                hasPunchLanded = true;
                boxerHealthPoints -= random.nextInt();
            } else if (random.nextInt() >= 90 || ((random.nextInt() < 100)) && (random.nextInt() >= 90)) {
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











