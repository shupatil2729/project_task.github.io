package Demo;

import java.util.Scanner;

public class asendingno {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc1.nextInt();

        int number[] = new int[size];
        System.out.println("enter element");

        for (int i = 0; i < size; i++) {
            number[i] = sc1.nextInt();
        }
        System.out.println("=================");
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
        System.out.println("================");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}
