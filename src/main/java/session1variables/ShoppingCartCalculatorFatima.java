package session1variables;

public class ShoppingCartCalculatorFatima {
    public static void main(String[] args) {

        double itemOnePrice = 5;
        double itemTwoPrice = 20;
        double itemThreePrice = 100;
        double salesTaxRate = 0.20;


        int itemOneQuantity = 4;
        int itemTwoQuantity = 20;
        int itemThreeQuantity = 50;


        double totalCostOfItemOne = itemOnePrice * itemOneQuantity;
        double totalCostOfItemTwo = itemTwoPrice * itemTwoQuantity;
        double totalCostOfItemThree = itemThreePrice * itemThreeQuantity;

        double subtotal = totalCostOfItemOne + totalCostOfItemTwo + totalCostOfItemThree;

        double tax = subtotal * salesTaxRate;

        double grandTotal = subtotal + tax;

        System.out.println(grandTotal);


    }
}
