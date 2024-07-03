package session3forloops.tasks;

public class TemperatureAverageFarai {

    public static void main(String[] args) {

        int [] dailyTemperatures = {10, 20, 18, 31, 12, 17, 28};
        int sum =0;

        for(int dailyTemperature:dailyTemperatures){

            sum+=dailyTemperature;
        }

        int averageTemperature = sum/dailyTemperatures.length;
        System.out.println("The average temperature for the week is " + averageTemperature);
    }
}
