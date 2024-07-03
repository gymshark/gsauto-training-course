package session3forloops.tasks;

public class TemperatureAveragesKodi {

  public static void main(String[] args) {
    // Declare and Initialize an Array
    int[] temperatures = {15, 25, 56, 70, 23, 45, 90};
    int tempLength = temperatures.length;

    //For loop
    int sum = 0;
    for (int i = 0; i < tempLength; i++) {
      sum += temperatures[i];
    }
    // calculate average
    int averageTemperatureForLoop = sum / tempLength;

    // For-Each Loop
    int sumTemperatures = 0;
    for (int temp : temperatures) {
      System.out.print(temp + " ");
      sumTemperatures += temp;
    }

    // Calculate Average
    int averageTemperatureForEachLoop = sumTemperatures / tempLength;

    //Output the Result
    System.out.printf("\nThe average temperature is: " + averageTemperatureForLoop + " Degrees - (For Loop)");
    System.out.printf("\nThe average temperature is: " + averageTemperatureForEachLoop + " Degrees - (For Each Loop)");

  }
}
