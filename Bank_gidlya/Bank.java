package Bank_gidlya;

public interface Bank {

    void deposit(String accNo, double amt);
    void withdraw(String accNo,int amt);
    double checkBalance(String accNo);

}
