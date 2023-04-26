 package advanceAbstraction;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selected account type");
        System.out.println("1:saving account");
        System.out.println("2:loan account");
        int choice = sc.nextInt();
        System.out.println("Enter account opening Balance");
        double balance = sc.nextDouble();

        AccountFactory factory = new AccountFactory();
        Account accRef = factory.createdAccount(choice,balance);

        System.out.println("================================");

        boolean status = true;
        while (status) {
            System.out.println("select more of transaction");
            System.out.println("1:Deposit ");
            System.out.println("2:Withdraw");
            System.out.println("3:Check");
            System.out.println("4:Exit");
            int Mode = sc.nextInt();
            switch (Mode) {
                case 1: {
                    System.out.println("Enter Deposit Amount");

                    double depositeAmt = sc.nextDouble();
                    accRef.deposite(depositeAmt);
                    accRef.checkBalance();
                }
                break;

                case 2: {
                    System.out.println("Enter Withdrawn  Amount");

                    double WithdrawAmt = sc.nextDouble();
                    accRef.withdraw(WithdrawAmt);
                    accRef.checkBalance();
                }
                break;

                case 3: {
                    accRef.checkBalance();
                }

                case 4: {
                    status = false;
                }
            }

        }
    }
}
