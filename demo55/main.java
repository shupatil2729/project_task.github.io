package demo55;



import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("select Bank");
        System.out.println("1:SBI \n2:ICICI");
        int choice = sc1.nextInt();
        System.out.println("ENTER amt");
        int amt = sc1.nextInt();
        System.out.println("ENTER time");
        int time = sc1.nextInt();
        if (choice == 1) {
            bank s1=new bank();
            //SBI S1 = new SBI();
            s1.Interesticici(amt, time);
        } else if (choice == 2) {
            bank s1=new bank();
          //  ICICI I1 = new ICICI();
            s1.Interestsbi(amt, time);
        }

    }
}
