package proraming_number;

public class StringTrim
{
    public static void main(String[] args)
    {
        String str="  shubham patil  ";
        System.out.println("Before :"+str.length());
       String nstr= str.trim();
        System.out.println("After :"+nstr.length());
    }
}
