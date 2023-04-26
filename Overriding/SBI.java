package Overriding;

public class SBI extends Bank  {

        @Override
        void  Interest(int amt,int time) {
            //5%  incert
            double total = amt * time;
            double finalAmt = total * 0.05;
            double totalfinalAmt = amt+finalAmt;
            System.out.println("Total final amt" + totalfinalAmt);
        }
    }
