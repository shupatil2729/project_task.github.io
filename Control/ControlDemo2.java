package Control;

import java.util.Scanner;

public class ControlDemo2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the product price");
        double price = sc1.nextDouble();
        System.out.println("Enter the qty");
        int qty = sc1.nextInt();
        calculation(price,qty);
    }

    static void calculation(double price, int qty) {
        double total = price * qty;
        System.out.println("total amt " + total);

        if (total >500 && total<1000) {
            double total1=total - (total * 0.05);
            System.out.println("5% Discount " + total1);
        } else if (total >1000) {
            double total2=total - (total * 0.10);
            System.out.println("10% Discount " + total2);
        }
        else {
            System.out.println("no dis");
        }

    }
}
