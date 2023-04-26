package proraming_number;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc1.nextInt();
        int [] arr= new int[size];
        for(int i=0; i<size;i++){
            arr[i]= sc1.nextInt();
        }

        for(int j=0; j<size ;j++) //arr.length
        {
            int temp=0;
            for(int k=j+1; k<size ;k++)  //arr.length
            {
              if(arr[j]>arr[k])
              {
                  temp=arr[j];
                  arr[j]=arr[k];
                  arr[k]=temp;
              }
            }
        }
        for(int b:arr)
        {
            System.out.println(b);
        }
        }
    }

