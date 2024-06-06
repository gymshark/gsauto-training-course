package session3forloops;

public class TemperatureAverageRich {
    public static void main(String[] args) {

        //Declare and Initialise an Array
        int[] dailyTemperatures = {5, 10, 11, 16, 17, 20};
        int sum = 0;

        //Loop to Calculate sum of temperature
        for (int dailyTemperature : dailyTemperatures) {
            sum += dailyTemperature;
            System.out.println(sum);
        }
        //Calculate Average
        int averageTemperature = (sum / dailyTemperatures.length);

        //Output of results
        System.out.println(averageTemperature);
    }
}
