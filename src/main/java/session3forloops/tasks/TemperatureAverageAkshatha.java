package session3forloops.tasks;

public class TemperatureAverageAkshatha {

  public static void main(String[] args) {
    int[] dailyTemperature = {20, 21, 22, 23, 24, 24};
    int sum = 0;
    for (int temp : dailyTemperature) {
      sum += temp;
      System.out.println(sum);
    }

    int avgTemperature = sum / dailyTemperature.length;
    System.out.println("The average temperature is " + avgTemperature);
  }
}
