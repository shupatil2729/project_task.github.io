package Interface1;
//subclass
//multiple inheritance
public class payment implements UPIPayment,WalletPayment{
    @Override
    public void   transferAmount()
    {
        System.out.println("Transfer amount to Account");
    }
    @Override
    public void billPayment()
    {
        System.out.println("make payment bill");
    }
}
