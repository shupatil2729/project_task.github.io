package proraming_number;

import java.util.Scanner;

public class sum_of_number {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter start number");
        int start = sc1.nextInt();
        System.out.println("Enter end number");
        int end = sc1.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
