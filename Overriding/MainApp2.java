package Overriding;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("select Bank");
        System.out.println("1:SBI \n2:ICICI");
        int choice= sc1.nextInt();
        System.out.println("ENTER amt");
        int amt= sc1.nextInt();
        System.out.println("ENTER time");
        int time= sc1.nextInt();
        if(choice==1){
             SBI S1=new SBI();
            S1.Interest(amt,time);
        }
        else
        if(choice==2){
           ICICI I1=new ICICI();
           I1.Interest (amt,time);
        }
    }
}
