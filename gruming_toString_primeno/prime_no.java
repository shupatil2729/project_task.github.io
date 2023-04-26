package gruming_toString_primeno;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {

        String s1 = "ABCD";
int count=0;
        for (int i=0; i<s1.length();i++){
            for (int j=i+1;j<=s1.length();j++){
                String a=s1.substring(i,j);
               System.out.println(s1.substring(i,j));

             System.out.println(a.length());
                 if(a.length()>=2 && a.length()%2!=0 || a.length()==2 ){
                     count++;
                 }
            }

        }
        System.out.println("================================");
        System.out.println("prime no = "+ count);

    }
}
