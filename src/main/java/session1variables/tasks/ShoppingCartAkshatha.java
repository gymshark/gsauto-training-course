package session1variables.tasks;

public class ShoppingCartAkshatha {

  public static void main(String[] args) {
    double itemPriceOne = 3.5;
    double itemPriceTwo = 4.54;
    double itemPriceThree = 5.46;

    double salesTaxValue = 0.20;

    int quantityOne = 5;
    int quantityTwo = 10;
    int quantityThree = 15;

    double totalItemOne = itemPriceOne * quantityOne;
    double totalItemTwo = itemPriceTwo * quantityTwo;
    double totalItemThree = itemPriceThree * quantityThree;

    double itemSubtotal = totalItemOne + totalItemTwo + totalItemThree;

    double tax = salesTaxValue * itemSubtotal;

    double grandTotal = itemSubtotal + tax;

    System.out.println("The subtotal is: " + grandTotal);
    System.out.println("The tax is: " + tax);
    System.out.println("The grand total is: " + itemSubtotal);
  }
}
