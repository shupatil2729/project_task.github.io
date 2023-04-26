package Demo;

import java.util.Scanner;

public class evenNo {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("start");
        int a= sc1.nextInt();
        System.out.println("end");
        int b=sc1.nextInt();
        int sum=0;
        for (int i=a;i<b;i++) {
            if (i % 2 != 0) {
                sum += i;

                System.out.println(i);
            }
        }

            System.out.println(sum);

          //
        }
    }
