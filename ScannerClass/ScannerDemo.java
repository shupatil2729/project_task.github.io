package ScannerClass;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter user name");
        String s=sc1.next();
        System.out.println("hello "+s);

    }
}
