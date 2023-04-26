package Demo;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc1.nextInt();
        System.out.println("Enter the colum");
        int colum = sc1.nextInt();

        int[][] number = new int[row][colum];

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
               number[i][j] = sc1.nextInt();
            }
        }
        System.out.println("a");
        int a=sc1.nextInt();
        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (number[i][j] == a) {
                    System.out.print(number[i][j]+" ");
                    System.out.print(i+","+j);
                }
            }
            System.out.println();
        }
    }
}
