package proraming_number;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc1.nextInt();
        int [] arr= new int[size];
        for(int i=0; i<size;i++){
            arr[i]= sc1.nextInt();
        }
        int sum=0;
        for(int j=0; j<size;j++){
            sum+=arr[j];
        }
        System.out.println(sum);
    }
}
