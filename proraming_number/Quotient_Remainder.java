package proraming_number;

import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number1");
        double no1= sc1.nextInt();
        System.out.println("Enter the number2");
        double no2= sc1.nextInt();

        double quotient=no1/no2;
        double remainder=no1%no2;

        System.out.println("quotient:"+quotient);
        System.out.println(" remainder:"+remainder);


    }
}
