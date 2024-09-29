package session3forloops.tasks;

public class TemperatureAverageFatima {

  public static void main(String[] args) {
    int[] dailyTemperatures = {16, 15, 18, 25, 24, 5};
    int sum = 0;

    for (int dailyTemperature : dailyTemperatures) {
      sum += dailyTemperature;
      System.out.println(sum);
    }
    int averageTemperature = (sum / dailyTemperatures.length);
    System.out.println(averageTemperature);
  }
}
