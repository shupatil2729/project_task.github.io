package Overriding;

public class Flipcart extends Ecommerce{
    @Override
    void  sellproduct(int qty,double price){
        //10% discount
        double total=qty*price;
        double finalAmt=total-(total*0.10);
        System.out.println("Total final amt"+finalAmt);
    }
}
