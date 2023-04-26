package Overriding;

public class ICICI extends Bank{
   @Override
    void  Interest(int amt,int time) {
        //10%  interest
        double total = amt * time;
        double finalAmt = total * 0.05;
        double totalfinalAmt =   amt+finalAmt;
        System.out.println("final amt" + totalfinalAmt);
    }
}
