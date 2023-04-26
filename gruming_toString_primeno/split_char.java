package gruming_toString_primeno;

public class split_char {
   static String s ="";
    public static void main(String[] args) {
        String s1 = "ABCDEFGHIJKLMNO";
        int len=s1.length();
        int n=len;


        if(len%n==0) {
            for(int i=0; i<n; i++) {
                s="";

                for(int j=3*i; j<(i+1)*3; j++ ) {
                    s=s+s1.charAt(j);

                }
                System.out.println(s);
            }
        }
        /*
        System.out.println(s.length());
        String [] arr=new String[s.length()];
        for(int k=0; k<s.length();k++){

           arr[k]= String.valueOf(s.charAt(k));
        }
        for(String x:arr){
            System.out.println(x);
        }
        */
        String str=s;
         String[]arr=null;
         arr=str.split(" ");
        for(int k=0; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

}

