package session3forloops;

public class TemperatureAverageMaryam {

    public static void main(String[] args) {
        int[] temperatures = {25, 24, 25, 23, 22, 22, 23, 27, 28, 29};

        int sum = 0;

        for (int temp : temperatures) {
            sum += temp;

        }
        int average = sum / temperatures.length;

        System.out.println("Average temperature is:" + average);
    }


}

