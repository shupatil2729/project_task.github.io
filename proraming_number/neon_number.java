package proraming_number;

import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc1.nextInt();

         int sum=0;
        int no1 = no * no;

        while (no1 != 0) {
           int b= (no1 % 10);
             sum=sum+b;
            no1= no1 / 10;

        }

        if(sum==no)
        {
            System.out.println("neon number");
        }
        else {
            System.out.println("not neon number");
        }
    }
}