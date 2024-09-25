package session3forloops.tasks;

public class TemperatureAverageMaria {

  public static void main(String[] args) {

    //Array declaration and initialisation - to store daily temperatures
    int[] dailyTemperature = {9, 12, 15, 13, 15, 17, 40};
    int sumTemp = 0;

    //foreach loop to calculate sum of all temperatures
    for (int temperature : dailyTemperature) {
      sumTemp += temperature;
    }
//Calculate average temperature
    int avgTemp = sumTemp / dailyTemperature.length;
//Print the average temperature
    System.out.println("Average Temperatures - " + avgTemp);
  }
}
