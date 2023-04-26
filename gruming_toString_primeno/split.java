package gruming_toString_primeno;
import java.util.Scanner;
public class split {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter a String");
            String str = sc.next();
            int len = str.length();

            System.out.println("Enter a Number");
            int n = sc.nextInt();
            int n1 = len/n;
            String s ="";
            String revStr="";
            if(len%n==0) {
                for(int i=0; i<n; i++) {
                    s = "";

                    for (int j = n1 * i; j < (i + 1) * n1; j++) {
                        s = s + str.charAt(j);

                    }
                    System.out.println(s);
                    //String is immutable so we have to convert it into


                  //  StringBuilder sb = new StringBuilder(s);
                  //  revStr = sb.reverse().toString();
                  //  System.out.println(revStr);


                }
                char [] charr=s.toCharArray();
                for (int k=0; k< charr.length; k++){
                    System.out.println(charr[k]);
                }
            }else {
                System.out.println("can not Split");
            }

        }


}
