package Test2;

import java.util.Scanner;

public class Que4 {
   public static void main(String[] args) {

       Scanner sc1=new Scanner(System.in);
     //  System.print.out("Enter the size");
       int size=sc1.nextInt();

       int [] arr=new int[size];
       for(int i=0;i<size;i++)
       {
        //   arr[i]=sc1.nextInt;
       }

       for(int j=0;j<size;j++)
       {
           int temp=0;
           {
               for(int k=j+1; k<size;k++)
               {
                   if(arr[j]>arr[k])
                   {
                       temp=arr[j];
                       arr[j]=arr[k];
                       arr[k]=temp;
                   }
               }
           }
           for(int b:arr)
           {
               System.out.print(b);
           }




       }
   }}
       /* String str="Good morning sir";
        for(int i=0;i<str.length();i++){
            int count=0;
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
            if(count>=2){
                System.out.println("duplicate character are "+ch);
                }
            }
        }
    }

*/
