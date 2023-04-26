package patternArray;

import java.util.Arrays;
import java.util.Scanner;

public class A3
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY...");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("ENTER THE ELEMENT OF ARRAY...");
        for (int a=0;a<size;a++)
        {
            arr[a]=sc.nextInt();
        }

        for(int i=0;i< arr.length;i++)
        {
            int temp=0;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k< arr.length;k++)
        {
            System.out.print(arr[k]+"  ");
        }
       //  System.out.println(Arrays.toString(arr));
    }
}
