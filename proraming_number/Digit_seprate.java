package proraming_number;

import java.util.Scanner;

public class Digit_seprate {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number");
        int no= sc1.nextInt();
        while (no!=0){
            System.out.println(no%10);
            no=no/10;
        }
    }
}
