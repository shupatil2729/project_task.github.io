package castingNonPrimetive;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("select type of tv");
        System.out.println("1:LCD");
        System.out.println("2:LEC");
        int choice=sc1.nextInt();

        TV t1=null;
        if(choice==1){
            t1=new LCD();  //upcasting

        } else if (choice==2) {
            t1=new LED();  //upcasting
        }
        t1.getType();
    }
}
