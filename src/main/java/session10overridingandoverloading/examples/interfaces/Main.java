package session10overridingandoverloading.examples.interfaces;

public class Main {

  public static void main(String[] args) {
    Car myCoupe = new Coupe();
    Car mySUV = new SUV();
    Car mySaloon = new Saloon();

    myCoupe.start();
  }
}
