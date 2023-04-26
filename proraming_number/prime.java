package proraming_number;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number");
        int no= sc1.nextInt();

        int count=0;

        for(int i=1;i<=no;i++){
        if( no%i==0)
        {
            count++;
        }
        }
        if(count<=2)
        {
            System.out.println("prime number");
        }
        else {
            System.out.println("not prime number");
        }
    }
}
