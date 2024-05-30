package session3forloops;

public class TemperatureAverageKodi {

  public static void main(String[] args) {
    // Declare and Initialize an Array
    int[] temperatures = {15, 25, 56, 70, 23, 45, 90};
    int templength = temperatures.length;

    //For loop
   /*  for (int i = 0; i < templength; i++) {
      int temperatureValue = temperatures[i];
     System.out.printf(temperatureValue + " ");
    } */

    // For-Each Loop
    int sumTemperatures = 0;
    for (int temp : temperatures) {
      System.out.print(temp + " ");
      sumTemperatures += temp;
    }

    // Calculate Average
    int averageTemperature = sumTemperatures / templength;

    //Output the Result
    System.out.printf("\nThe average temperature is: " + averageTemperature + " Degrees");
  }
}