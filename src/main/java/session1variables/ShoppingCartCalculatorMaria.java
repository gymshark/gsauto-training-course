package session1variables;

public class ShoppingCartCalculatorMaria {
/* Variable Declarations
. Variable Declarations:
1. Declare individual double variables for three item prices.
2. Declare a double for the sales tax rate. (20% tax – ‘double
salesTax = 0.20’)
3. Use int for quantities of each item, with separate variables.
4. So 7 variables in total
*/
public static void main(String[] args) {

    double itemPrice1 = 3.45;
    double itemPrice2 = 45.6;
    double itemPrice3 = 22.345;
    double salesTaxRate = 0.20;
    int itemQuantity1 = 4;
    int itemQuantity2 = 6;
    int itemQuantity3 = 19;

/*
2. Calculation:
1. Compute the total cost for each item by multiplying the item
price by its quantity.
2. Sum these totals for a subtotal.
3. Calculate the tax by applying the sales tax rate to the
subtotal.
4. Compute the grand total by adding the subtotal and the tax.
*/

    double itemTotalCost1 = itemPrice1 * itemQuantity1;
    double itemTotalCost2 = itemPrice2 * itemQuantity2;
    double itemTotalCost3 = itemPrice3 * itemQuantity3;
    double subTotal = itemTotalCost1 + itemTotalCost2 + itemTotalCost3;
    double calculatedTax = salesTaxRate * subTotal;
    double grandTotal = calculatedTax + subTotal;

/*
3. Output the Result:
Print the subtotal, the calculated tax, and the grand total.
            */

    System.out.println("Subtotal , Calculated tax and the GrandTotal are " + subTotal +", "+ calculatedTax +", "+ grandTotal);
}
}
