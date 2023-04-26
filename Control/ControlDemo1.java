package Control;

import java.util.Scanner;

public class ControlDemo1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc1.nextInt();
        validation(age);
    }
    static void validation(int age){
        if(age>=18){
            System.out.println("Eligible");
        }else {
            System.out.println("not Eligible");
        }
    }
}
