package constructor;

import java.util.Scanner;

public class Laptop {
    int ramSize;
    String laptopName;
    double laptoprice;
    Laptop(int size,String name,double price){
        ramSize=size;
        laptopName=name;
        laptoprice=price;

    }
    void display(){
        System.out.println(ramSize);
        System.out.println(laptopName);
        System.out.println(laptoprice);
    }
}
class MainApp3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER RAM SIZE");
        int ram= sc.nextInt();
        System.out.println("ENTER LAPTOP NAME ");
        String name=sc.next();
        System.out.println("ENTER LAPTOP PRICE");
        double price= sc.nextDouble();
        
        Laptop l1=new Laptop(ram,name,price);
        l1.display();

    }
}
