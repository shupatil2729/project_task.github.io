package Bank_gidlya;

import java.util.ArrayList;

public class ICICI_BANK implements Bank {
    double totalbal = 0.0;
    ArrayList<customer> b1 = new ArrayList<>();

    {
        customer c1 = new customer("a", "1231", 5000);
        customer c2 = new customer("b", "1232", 5000);
        customer c3 = new customer("c", "1233", 5000);
        b1.add(c1);
        b1.add(c2);
        b1.add(c3);
    }

    @Override
    public void deposit(String accNo, double amt) {
        boolean status=true;
        for (customer b : b1) {
            if (accNo.equals(b.getAccno())) {
                double balance = b.getBankBalance();
                balance = balance + amt;
                b.setBankBalance(balance);
            }
            else {
                status=false;
            }
        }if(status==false){
            System.out.println("not match acc no");
        }

    }

    @Override
    public void withdraw(String accNo, int amt) {
        boolean status=true;
        for (customer b : b1) {
            if (accNo.equals(b.getAccno())) {
                double balance = b.getBankBalance();
                balance = balance - amt;
                b.setBankBalance(balance);
            }else {
                status=false;
            }
        }if(status==false){
            System.out.println("not match acc no");
        }

    }

    @Override
    public double checkBalance(String accNo) {
        double balance=0;
        boolean status=true;
        for (customer b : b1) {
            if (accNo.equals(b.getAccno()))
            {
                balance = b.getBankBalance();
            }else {
                status=false;
            }
        }if(status==false){
            System.out.println("not match acc no");
        }
         return balance;
    }
}
