package session1variables.tasks;

public class ShoppingCartCalculatorAkeem {

    public static void main(String[] args) {

        double tshirt = 12.99;
        double joggers = 15.99;
        double cap = 10.99;
        double taxRate = 0.2;

        int tshirtQuantity = 2;
        int joggersQuantity = 2;
        int capQuantity = 4;

        double tshirtTotalCost = tshirt * tshirtQuantity;
        double joggersTotalCost = joggers * joggersQuantity;
        double capTotalCost = cap * capQuantity;

        double subTotal = tshirtTotalCost + joggersTotalCost + capTotalCost;
        double tax = subTotal * taxRate;
        double grandTotal = subTotal + tax;

        System.out.println(subTotal + tax + grandTotal);
    }

}
