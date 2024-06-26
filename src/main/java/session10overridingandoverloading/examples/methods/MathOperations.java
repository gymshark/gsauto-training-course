package session10overridingandoverloading.examples.methods;

public class MathOperations {

  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public int add(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public static void main(String[] args) {
    MathOperations mathOperations = new MathOperations();

    mathOperations.add(1,2);
    mathOperations.add(1,2,3,4);

    mathOperations.add(2.0, 6.0);
  }
}
