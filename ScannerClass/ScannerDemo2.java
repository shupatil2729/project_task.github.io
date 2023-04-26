package ScannerClass;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc1.nextInt();
        System.out.println("Enter  2nd no");
        int b = sc1.nextInt();


        add(a,b);
        sub(a,b);
    }

    static void add(int a, int b) {
        int c = a + b;
        System.out.println("Add " + c);

    }

    static void sub(int a, int b) {
        int c = a - b;
        System.out.println("sub " + c);

    }
}