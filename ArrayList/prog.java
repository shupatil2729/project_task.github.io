package ArrayList;

import Array.main;

import java.util.Scanner;


public class prog
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int[]arr= new int[size];
         int maxcount=0;
         int num=0;
        System.out.println("ENTER THE ELEMENT   OF ARRAY : ");
         for (int k=0;k<size;k++)
         {
             arr[k]=sc.nextInt();
         }
        for(int i=0;i<arr.length;i++)
        {
            int count=0;


            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(maxcount<count)
            {
                maxcount=count;
                num=arr[i];
            }
        }
        System.out.println("maximum occurance of number : "+maxcount);
        System.out.println("maximum occured  number : "+num);

    }

}
