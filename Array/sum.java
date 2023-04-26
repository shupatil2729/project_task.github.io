package Array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter no sub");
        int sub=sc1.nextInt();

        double sum=0.0;
        double[]mark=new double[sub];
        System.out.println("enter the mark");
        for(int i=0;i<sub;i++) {
            mark[i] = sc1.nextDouble();
        }
        System.out.println("enter x");

        int x=sc1.nextInt();
        for(int i=0;i<sub;i++){
            mark[i]=sc1.nextDouble();

            if (mark[i]==x){

            }
        }


        System.out.println(x);
        //System.out.println("mark"+sum);
      //  double per=sum/sub;
        //System.out.println(per);

    }
}
