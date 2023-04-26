package Overriding;

import java.util.Scanner;

public class Mainapp1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("select platform");
        System.out.println("1:Amazon \n2: Flipcart");
        int choice= sc1.nextInt();
        System.out.println("ENTER QTY");
        int qty= sc1.nextInt();
        System.out.println("ENTER PRICE");
        int price= sc1.nextInt();
        if(choice==1){
            Amazon A1=new Amazon();
            A1.sellproduct(qty,price);
        }
        else
            if(choice==2){
                Flipcart F1=new Flipcart();
                F1.sellproduct(qty,price);
            }
    }
}
