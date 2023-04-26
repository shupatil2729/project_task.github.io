package Dao_Dto;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        BookOperation bo = new BookOperation();


        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("1:Add new Book");
            System.out.println("2:Display Book");
            System.out.println("3:Delete Book");
            System.out.println(" Other option  Exit");
            int choice = sc1.nextInt();
            boolean status = true;
            switch (choice) {
                case 1:
                    System.out.println("enter bookId");
                    int id= sc1.nextInt();
                    System.out.println("enter book name");
                    String name=sc1.next();
                    System.out.println("enter book price");
                    double price= sc1.nextDouble();
                    bo.addBook(id,name,price);
                    break;
                case 2:
                    bo.displayBook();
                    break;
                case 3:
                    System.out.println("enter id");
                    int id1= sc1.nextInt();
                    bo.deleteBook(id1);
                    break;
                default:
                    status=false;

            }

        }
    }
}