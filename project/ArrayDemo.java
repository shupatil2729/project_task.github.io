package project;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE COUNT");
        int count= sc.nextInt();

        String[] data1=new String[count];
        System.out.println("ENTER USERNAME");
        for(int a=0; a<count;a++) {
            data1[a] = sc.next();
        }
        for(int i=0;i<count;i++)
        {

            System.out.println("WELCOME + \n"+  data1[i]);
        }
    }
}
