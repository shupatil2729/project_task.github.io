package String;

import java.util.Scanner;

public class trim {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc1.nextLine();

        System.out.println(name.isEmpty());

    }
}
