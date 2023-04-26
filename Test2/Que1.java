package Test2;
import java.util.Scanner;
public class Que1 {

    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc1=new Scanner(System.in);
       int  num=sc1.nextInt();

       int  num1=num;
               int  A=0;
               while(num!=0){
                       int r=num%10;
                       num=(num/10);
                       A=(A*10)+r;
        }
        System.out.println(A);
               if(num1==A) {
                   System.out.println("THIS IS PALINDOROME ");
               }
               else {
                   System.out.println("THIS IS NOT PALINDOROME");
               }
    }
}
