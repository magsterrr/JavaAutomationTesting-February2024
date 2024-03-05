package Exercise3;

import java.util.Scanner;

public class RevenueCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double unitPrice = Double.parseDouble(scanner.nextLine());
        double quantity = Double.parseDouble(scanner.nextLine());

        double discount = 0;
        double revenue = 0;
        double discountAmount = 0;

        if (quantity>= 100 && quantity <= 120) {
            discount = 0.15;
            discountAmount = (unitPrice*quantity) * discount;
            revenue = (unitPrice*quantity) - discountAmount;
        }

        if (quantity>120) {
            discount = 0.20;
            discountAmount = (unitPrice*quantity) * discount;
            revenue = (unitPrice*quantity) - discountAmount;
        }

        if (quantity<100) {
            revenue = unitPrice * quantity;
        }

        System.out.println("The revenue from the sale is: " + revenue + "$");
        System.out.println("Discount: " +discountAmount + "$ (" + (discount*100) + "%)");

    }
}
