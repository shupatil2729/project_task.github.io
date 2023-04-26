package proraming_number;

import java.util.Scanner;

public class factorialno {
    public static void main(String[] args) {


        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number");
        int no= sc1.nextInt();
       int  result =1;
        for (int i = 1; i <=no; i++) {

            result=result*i;
        }
        System.out.println(result);
    }
}
