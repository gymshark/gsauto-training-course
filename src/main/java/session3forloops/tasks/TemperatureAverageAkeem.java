package session3forloops.tasks;

public class TemperatureAverageAkeem {

  public static void main(String[] args) {
    int[] temperatures = {15, 10, 25, 16, 19, 12};
    int sum = 0;

    for (int temperature : temperatures) {
      sum += temperature;
    }
    int averageTemperature = sum / temperatures.length;
    System.out.println(averageTemperature);
  }
}
