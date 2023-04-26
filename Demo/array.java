package Demo;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc1.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc1.nextInt();
        }
        System.out.println("a");
        int a = sc1.nextInt();


            for (int i = 0; i < size; i++) {
                if (number[i] % a == 0) {
                    // System.out.println(number[i]);
                    System.out.println(i);
                }
            }
        }
    }

