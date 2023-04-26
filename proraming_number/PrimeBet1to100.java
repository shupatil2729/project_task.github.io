package proraming_number;

import java.util.Scanner;

public class PrimeBet1to100
{
    public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
        System.out.println("Enter start number");
        int start= sc1.nextInt();
        System.out.println("Enter end number");
        int end= sc1.nextInt();

        for (int j=start;j<=end;j++)
        {
            int no=j;

        int count=0;

        for(int i=1;i<=no;i++){
    if( no%i==0)
    {
        count++;
    }
}
        if(count==2)
    {
        System.out.println(j);
    }

}
}
}
