package session1variables;

public class ShoppingCartCalculatorFarai {
    public static void main(String[] args) {

        double itemPriceOne = 5.0;
        double itemPriceTwo = 10.0;
        double itemPriceThree = 15.0;

        double salesTax = 0.20;

        int quantityItemOne = 15;
        int quantityItemTwo = 10;
        int quantityItemThree = 5;

        double totalCostItemOne = itemPriceOne * quantityItemOne;
        double totalCostItemTwo = itemPriceTwo * quantityItemTwo;
        double totalCostItemThree = itemPriceThree * quantityItemThree;

        double subtotal = totalCostItemOne + totalCostItemTwo + totalCostItemThree;

        double tax = salesTax * subtotal;

        double grandTotal = tax + subtotal;

        System.out.println("The grand total is: £" +grandTotal);
        System.out.println("The tax is: £" +tax);
        System.out.println("The subtotal is: £"+subtotal);
    }
}
