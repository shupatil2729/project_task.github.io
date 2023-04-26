package gruming_toString_primeno;

public class split_0 {
    public static void main(String[] args) {
        String str1="abcdefghijklmno";
        String str2="";
        int length=str1.length()/5;
        for(int i=0;i<str1.length();i+=length)
        {         // get incremented by dividend for equal 5 part
            String subStr=null;//it have to get created every time for initialization of new substr
            String revStr="";
            for(int j=i+1;j<=i+length && j<=str1.length();j++)
            { //i+length 0+3 it will goes for 3 letter
                // and j=i+1 use because substring returns the n-1 value if start is 0 and end is 5 it will return 0-4
                subStr = str1.substring(i,j);
                StringBuilder sb = new StringBuilder(subStr);//String is immutable so we have to convert it into
                revStr = sb.reverse().toString();//String buffer for reverse operation after reversing we have
                //to convert stringbuilder to string that's why we use toString here
            }
            System.out.println(subStr);
            str2+=revStr;

        }
        System.out.println(str2);
    }
}
