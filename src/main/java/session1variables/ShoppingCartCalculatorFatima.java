package session1variables;

public class ShoppingCartCalculatorFatima {
    public static void main(String[] args) {

        //1.	Declare individual double variables for three item prices.
        //2.	Declare a double for the sales tax rate. (20% tax – ‘double salesTax = 0.20’)
        //3.	Use int for quantities of each item, with separate variables.
        //4.	So 7 variables in total

        double itemOnePrice = 5;
        double itemTwoPrice = 20;
        double itemThreePrice = 100;

        double salesTaxRate = 0.20;

        int itemOneQuantity = 4;
        int itemTwoQuantity = 20;
        int itemThreeQuantity = 50;

        //1.	Compute the total cost for each item by multiplying the item price by its quantity.
        //2.	Sum these totals for a subtotal.
        //3.	Calculate the tax by applying the sales tax rate to the subtotal.
        //4.	Compute the grand total by adding the subtotal and the tax.

        double totalCostOfItemOne = itemOnePrice * itemOneQuantity;
        double totalCostOfItemTwo = itemTwoPrice * itemTwoQuantity;
        double totalCostOfItemThree = itemThreePrice * itemThreeQuantity;

        double salesTaxRateItemOne = totalCostOfItemOne * salesTaxRate;
        double salesTaxRateItemTwo = totalCostOfItemTwo * salesTaxRate;
        double salesTaxRateItemThree = totalCostOfItemThree * salesTaxRate;

        double grandTotal = (salesTaxRateItemOne + salesTaxRateItemTwo + salesTaxRateItemThree) +
                (totalCostOfItemOne + totalCostOfItemTwo + salesTaxRateItemThree);

        System.out.println(grandTotal);



    }
}
