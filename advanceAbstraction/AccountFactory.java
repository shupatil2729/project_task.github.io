package advanceAbstraction;

public class AccountFactory {
    Account createdAccount(int choice,double amt){
        Account a1=null;
        if(choice==1){
           a1=new SavingAccount(amt);
        }
        else if (choice==2){
            a1=new LoanAccount(amt);
        }
        return  a1;
    }
}
