package Overriding;

public class Amazon extends Ecommerce{
    @Override
    void  sellproduct(int qty,double price){
        //5% discount
        double total=qty*price;
        double finalAmt=total-(total*0.05);
        System.out.println("final amt"+finalAmt);
    }
}
