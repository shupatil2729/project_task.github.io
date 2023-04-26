package proraming_number;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc1.nextInt();
        int count=0;
        for(int i=1;i<=no;i++){
            if( no%i==0)
            {
                System.out.println(i+"  ");
            }

        }
    }
}
