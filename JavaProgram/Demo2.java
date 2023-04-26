package JavaProgram;

public class Demo2 {
    public static void main(String[] args) {
        int qty=20;
        double price=500;

       double total=qty*price;
       //apply dis 10%
        double dis=total*0.10;
        double finalAmt =total-(total*0.10);
        //print info
        System.out.println("total "+total);
        System.out.println("discount "+total*0.10);
        System.out.println("final Amount "+finalAmt);


    }
}
