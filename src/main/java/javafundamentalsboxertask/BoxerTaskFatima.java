package javafundamentalsboxertask;
import java.util.Random;

public class BoxerTaskFatima {

    //Player has 100 punches, each with a randomly assigned punch strength between 1 - 100
    //Every time a number that's a multiple of 5, a punch connects
    //Every time a number is 90 or above, it's a double strength punch
    //Each punch can hit up to the initial limit of 100 strength (before doubling)
    //The boxer you are facing has 1000 health points
    //Can you knock the boxer out with 100 punches?


    public static void main(String[] args) {

        int boxerHealthPoints = 1000;
        int[] punches = new int[100];

        Random random = new Random();

        for (int i = 0; i < punches.length; i++) {
            random.nextInt();
            Math.subtractExact(boxerHealthPoints, random.nextInt());

            if (random.nextInt() % 5 == 0) {
                System.out.println("Punch Landed!");
            } else if (random.nextInt() >= 90) {
                System.out.println("Haymaker Landed!");
            } else System.out.println("Punch Missed!");

        }

        if (boxerHealthPoints <= 0) {
            System.out.println("Knockout");
        } else if (boxerHealthPoints > 0) {
            System.out.println("He's still standing!");
            System.out.println(boxerHealthPoints);
        }
    }
}












