package Test2;

import java.util.Scanner;

public class Max_minnumber
{
    static int max;
    static int min;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int num1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2= sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER");
        int num3= sc.nextInt();
        maxnum(num1,num2,num3);
        System.out.println("MAX NUMBER : " +max);
        minnum(num1,num2,num3);
        System.out.println("MIN NUMBER : "+min);

    }
    public static int maxnum(int num1,int num2,int num3)
    {
        if(num1>num2 && num1>num3)
        {
            max=num1;

        }
        else if(num2>num1 && num2>num3)
        {
            max=num2;

        }
        else
        {
            max=num3;

        }

        return max;
    }

    public static int minnum(int num1,int num2,int num3)
    {
        if(num1<num2 && num1<num3)
        {
            min=num1;

        }
        else if(num2<num1 && num2<num3)
        {
            min=num2;

        }
        else
        {
            min=num3;

        }

        return min;
    }

}
