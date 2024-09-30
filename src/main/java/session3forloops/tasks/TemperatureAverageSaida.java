package session3forloops.tasks;

public class TemperatureAverageSaida {
    public static void main(String[] args) {
        int[] dailyTemp = {27, 29, 30, 36, 18};
        int sum = 0;
        for (int dailyTemp1 : dailyTemp) {
            sum += dailyTemp1;
        }
        System.out.println(sum);
        int average = sum / dailyTemp.length;
        System.out.println(average);
    }
}