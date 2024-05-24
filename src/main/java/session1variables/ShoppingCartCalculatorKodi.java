package session1variables;

public class ShoppingCartCalculatorKodi {

  public static void main(String[] args) {
    // Declare individual double variables for three item prices
    final double priceItem1 = 2.00;
    final double priceItem2 = 4.00;
    final double priceItem3 = 6.00;

    // Declare a double for the sales tax rate
    final double salesTaxRate = 0.20; // 20% sales tax

    // Declare quantities of each item as int
    final int quantityItem1 = 2;
    final int quantityItem2 = 4;
    final int quantityItem3 = 6;

    //Compute the total cost for each item by multiplying the item price by its quantity
    double totalItem1 = priceItem1 * quantityItem1;
    double totalItem2 = priceItem2 * quantityItem2;
    double totalItem3 = priceItem3 * quantityItem3;

    // Print out totals for items
    System.out.println("Receipt: " + "\n" + "_____________________");

    System.out.println("\n" + "Item 1: " + "£" + totalItem1);
    System.out.println("Item 2: " + "£" + totalItem2);
    System.out.println("Item 3: " + "£" + totalItem3 + "\n" + "_____________________");

    // Sum these totals for a subtotal
    double calcSubTotal = (totalItem1 + totalItem2 + totalItem3);
    System.out.println("\n" + "Subtotal: " + "£" + calcSubTotal);
    System.out.println("VAT: " + salesTaxRate);

    //Calculate the tax by applying the sales tax rate to the subtotal
    double calcSalesTax = (calcSubTotal * salesTaxRate);
    System.out.println("Total Tax: " + calcSalesTax);

    // Compute the grand total by adding the subtotal and the tax
    double calcTotalCost = (calcSubTotal + calcSalesTax);
    System.out.println("""

      _____________________
      """);
    System.out.println("Total (inc Tax): " + "£" + calcTotalCost);
  }
}
