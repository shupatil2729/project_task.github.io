package Array;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean status = true;

        while (status) {
            System.out.println("select product");
            System.out.println("0:TV\n1:laptop\n2:mobile\nexist");
            int choice = sc.nextInt();
            System.out.println("enter qty");
            int qty = sc.nextInt();

            storeManager s1 = new storeManager();
            if (choice == 0 || choice == 1 || choice == 2) {
                s1.calculationBill(choice, qty);

            } else {
                System.out.println("in valid choice");
                status = false;
            }

        }

    }
}
