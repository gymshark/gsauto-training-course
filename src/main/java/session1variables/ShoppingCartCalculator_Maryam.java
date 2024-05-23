package session1variables;

public class ShoppingCartCalculator_Maryam {
  public static void main (String[] args )
    {
        // Variable declaration
        double price1 = 15.8;
        double price2 = 12.5;
        double price3 = 14.45;
        double salestax = 0.20;

        int item1Quantity = 2;
        int item2Quantity = 4;
        int item3Quantity = 5;

    //Calculation
        double CostItem1 = price1 * item1Quantity;
        double CostItem2 = price2 * item2Quantity;
        double CostItem3 = price3 * item3Quantity;
        double subtotal = CostItem1 + CostItem2 + CostItem3;
        double VAT = subtotal * salestax;
        double GrandTotal = VAT + subtotal;

        System.out.println("Sub Total: £" + subtotal);
        System.out.println("Tax applied: £" + VAT);
        System.out.println("Grand Total: £" + GrandTotal);
    }

}
