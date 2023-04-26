package advanceAbstraction;

public class SavingAccount implements Account{

    double accountBalance=0.0;

    public  SavingAccount(double accountBalance){
        this.accountBalance=accountBalance;
        System.out.println("Saving account create");
    }


    @Override
    public void deposite(double amt) {
        accountBalance+=amt;
        System.out.println(amt+ "Rs create to your Account");
    }

    @Override
    public void withdraw(double amt) {
        if (amt<=amt) {
            accountBalance -= amt;
            System.out.println(amt + "Rs debited to your Account");
        }else {
            System.out.println("Insufficient Balance");
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Account Balance is " + accountBalance);
    }
}
