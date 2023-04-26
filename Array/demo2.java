package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer>data1=new ArrayList<>();
        ArrayList<Integer>data2=new ArrayList<>();
        ArrayList<Integer>data3=new ArrayList<>();
        Scanner sc1=new Scanner(System.in);
        System.out.println("start");
        int start= sc1.nextInt();
        System.out.println("end");
        int end= sc1.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(i%2==0 && i%3==0)
            {
                data3.add(i);
            }
            else if(i%2==0)
            {
                data1.add(i);
            }
            else if(i%3==0)
            {
                data2.add(i);
            }

        }
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        }

    }
