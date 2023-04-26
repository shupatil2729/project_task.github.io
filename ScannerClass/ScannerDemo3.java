package ScannerClass;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter f name");
        String f = sc1.next();
        System.out.println("Enter m name");
        String m = sc1.next();
        System.out.println("Enter l name");
        String l = sc1.next();
        fullname(f, m, l);
    }
        static void fullname (String f, String m, String l){
            String b = f + m + l;
            System.out.println("full name " + b);
        }
    }

