package session1variables;

public class ShoppingCartRich {

    public static void main(String[] args) {
        double priceItem1 = 5.00;
        double priceItem2 = 15.00;
        double priceItem3 = 10.00;

        double salesTax = 0.20;

        int quantity1 = 5;
        int quantity2 = 15;
        int quantity3 = 7;

        double totalItem1 = priceItem1 * quantity1;
        double totalItem2 = priceItem2 * quantity2;
        double totalItem3 = priceItem3 * quantity3;

        double subtotal = totalItem1 + totalItem2 + totalItem3;

        double tax = subtotal * salesTax;

        double grandTotal = subtotal + tax;

        System.out.println(subtotal);
        System.out.println(tax);
        System.out.println(grandTotal);


    }
}
