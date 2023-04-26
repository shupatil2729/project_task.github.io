package Array;


import java.util.Scanner;

public class arrayDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int no=sc1.nextInt();
        double [] arr1=new double[5];
         arr1[0]=10;
         arr1[1]=20;
         arr1[2]=30;
         arr1[3]=40;
         arr1[4]=50;
         boolean found=false;
         for (int a=0; a<5;a++){
           if(arr1[a]==no){
               System.out.println("number exist");
               found=true;
           }
         }

    }
}
