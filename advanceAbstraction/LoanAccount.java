package advanceAbstraction;

public class LoanAccount implements Account{
    double LoanAmount=0.0;

    public LoanAccount(double LoanAmount){
        this.LoanAmount=LoanAmount;
        System.out.println("Loan account create");
    }
    @Override
    public void deposite(double amt) {
        LoanAmount-=amt;
        System.out.println(amt +"Rs Debited from Account");
    }

    @Override
    public void withdraw(double amt) {
    LoanAmount+=amt;
        System.out.println(amt +" Rs Creadited to your Account");
    }

    @Override
    public void checkBalance() {
        System.out.println("Active loan amount");
    }
}
