package Bank_gidlya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        ICICI_BANK b1=new ICICI_BANK();
        boolean status = true;
        System.out.println("enter accno");
        String accno = sc1.next();
        while (status) {

            System.out.println("1:Deposit money");
            System.out.println("2:Withdraw money");
            System.out.println("3:Display bank balance");
            System.out.println("other than no  exit");
            int choice = sc1.nextInt();


            switch (choice) {
                case 1:

                    System.out.println("enter amount");
                    double amt = sc1.nextDouble();
                    b1.deposit(accno, amt);
                    break;
                case 2:
                    System.out.println("enter amount");
                    int amt1 = sc1.nextInt();
                    b1.withdraw(accno,amt1);
                    break;
                case 3:

                    System.out.println( b1.checkBalance(accno));
                    break;
                default:

                    status = false;
            }
        }

    }
}
