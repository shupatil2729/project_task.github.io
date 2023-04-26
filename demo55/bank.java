package demo55;

public class bank {
    void  Interesticici(int amt,int time) {
        //10%  interest
        double total = amt * time;
        double finalAmt = total * 0.05;
        double totalfinalAmt = amt + finalAmt;
        System.out.println("final amt" + totalfinalAmt);
    }
    void  Interestsbi(int amt,int time) {
        //5%  incert
        double total = amt * time;
        double finalAmt = total * 0.10;
        double totalfinalAmt = amt + finalAmt;
        System.out.println("Total final amt" + totalfinalAmt);
    }
}
