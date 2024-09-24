package session1variables.tasks;

public class ShoppingCartCalculatorSaida {

  public static void main(String[] args) {
    double apple = 10;
    double orange = 20;
    double banana = 30;
    double salesTax = 0.20;
    int appleQuantity = 4;
    int orangeQuantity = 2;
    int bananaQuantity = 7;

    double subtotal = (apple * appleQuantity) + (orange * orangeQuantity) + (banana * bananaQuantity);
    System.out.println("Subtotal is " + subtotal);
    double calculatedTax = subtotal * salesTax;
    System.out.println("The calculated tax is " + calculatedTax);
    double grandTotal = subtotal + calculatedTax;
    System.out.println("The grand total is " + grandTotal);


  }
}
