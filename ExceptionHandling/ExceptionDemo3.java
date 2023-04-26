package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
try {

    System.out.println("Enter 1 no");
    int no1 = sc1.nextInt();
    System.out.println("Enter 2 no");
    int no2 = sc1.nextInt();

    int result = no1 / no2;
    System.out.println("Division" + result);


}catch (ArithmeticException a){
    System.out.println(a);
}catch (InputMismatchException i){
    System.out.println(i);
}
        System.out.println("program Ended");

    }

}
